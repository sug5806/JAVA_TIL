package core.jdbc;

import core.custom_exception.DataAccessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    private static final Logger log = LoggerFactory.getLogger(JdbcTemplate.class);

    private void update(String query, PreparedStatementSetter pss) throws DataAccessException {
        try (Connection con = ConnectionManager.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pss.setValues(pstmt);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            log.error(e.getMessage());
            throw new DataAccessException(e);
        }
    }

    public void update(String query, Object... values) throws DataAccessException {
        update(query, createPreparedStatementSetter(values));
    }

    private <T> List<T> query(String sql, PreparedStatementSetter pss, RowMapper<T> rm) throws DataAccessException {
        ResultSet rs = null;

        try (Connection con = ConnectionManager.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pss.setValues(pstmt);

            rs = pstmt.executeQuery();

            List<T> result = new ArrayList<>();

            while (rs.next()) {
                result.add(rm.mapRow(rs));
            }

            return result;
        } catch (SQLException e) {
            log.error(e.getMessage());
            throw new DataAccessException(e);

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    log.error(e.getMessage());
                }
            }
        }
    }

    public <T> List<T> query(String sql, RowMapper<T> rm, Object... values) throws DataAccessException {
        return query(sql, createPreparedStatementSetter(values), rm);
    }

    private <T> T queryForObject(String query, PreparedStatementSetter pss, RowMapper<T> rm) throws DataAccessException {
        List<T> result = query(query, pss, rm);
        if (result.isEmpty()) {
            return null;
        }

        return result.get(0);
    }

    public <T> T queryForObject(String query, RowMapper<T> rm, Object... values) throws DataAccessException {
        return queryForObject(query, createPreparedStatementSetter(values), rm);
    }

    private PreparedStatementSetter createPreparedStatementSetter(Object... parameters) {
        return new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement pstmt) throws SQLException {
                for (int i = 0; i < parameters.length; i++) {
                    pstmt.setObject(i + 1, parameters[i]);
                }
            }
        };
    }
}
