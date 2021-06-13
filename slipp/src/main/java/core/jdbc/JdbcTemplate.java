package core.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {
    private static final Logger log = LoggerFactory.getLogger(JdbcTemplate.class);

    public void update(String query, PreparedStatementSetter pss) throws SQLException {
        try (Connection con = ConnectionManager.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pss.setValues(pstmt);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }

    public List query(String sql, PreparedStatementSetter pss, RowMapper rm) throws SQLException {
        ResultSet rs = null;

        try (Connection con = ConnectionManager.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pss.setValues(pstmt);

            rs = pstmt.executeQuery();

            List<Object> result = new ArrayList<>();

            while (rs.next()) {
                result.add(rm.mapRow(rs));
            }

            return result;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public Object queryForObject(String query, PreparedStatementSetter pss, RowMapper rm) throws SQLException {
        List result = query(query, pss, rm);
        if (result.isEmpty()) {
            return null;
        }

        return result.get(0);
    }
}
