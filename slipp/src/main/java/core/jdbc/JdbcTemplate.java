package core.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class JdbcTemplate {
    private static final Logger log = LoggerFactory.getLogger(JdbcTemplate.class);

    public void update(String query) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ConnectionManager.getConnection();
            String sql = query;
            pstmt = con.prepareStatement(sql);
            setValues(pstmt);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            log.error(e.getMessage());
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }

            if (con != null) {
                con.close();
            }
        }
    }

    public abstract void setValues(PreparedStatement pstmt) throws SQLException;
}
