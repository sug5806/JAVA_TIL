package core.jdbc;

import next.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class UpdateJdbcTemplate {
    private static final Logger log = LoggerFactory.getLogger(UpdateJdbcTemplate.class);

    public void update(User user) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ConnectionManager.getConnection();
            String sql = createQueryForUpdate();
            pstmt = con.prepareStatement(sql);
            setValuesForUpdate(user, pstmt);

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

    public abstract void setValuesForUpdate(User user, PreparedStatement pstmt) throws SQLException;

    public abstract String createQueryForUpdate();
}
