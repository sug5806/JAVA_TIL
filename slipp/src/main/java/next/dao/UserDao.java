package next.dao;

import core.jdbc.JdbcTemplate;
import core.jdbc.PreparedStatementSetter;
import core.jdbc.RowMapper;
import next.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserDao.class);

    public void insert(User user) throws SQLException {

        PreparedStatementSetter pss = pstmt -> {
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getEmail());

            return pstmt;
        };

        JdbcTemplate insertJdbcTemplate = new JdbcTemplate() {
        };

        String query = "INSERT INTO USERS VALUES (?, ?, ?, ?)";

        insertJdbcTemplate.update(query, pss);
    }

    public void update(User user) throws SQLException {
        PreparedStatementSetter pss = pstmt -> {
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getUserId());

            return pstmt;
        };

        JdbcTemplate updateJdbcTemplate = new JdbcTemplate() {
        };

        String query = "UPDATE USERS SET userId=?, password=?, name=?, email=? WHERE userId=?";

        updateJdbcTemplate.update(query, pss);
    }

    public List<User> findAll() throws SQLException {

        PreparedStatementSetter pss = pstmt -> pstmt;

        RowMapper rm = rs -> new User(
                rs.getString("userId"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email")

        );

        JdbcTemplate selectTemplate = new JdbcTemplate() {
        };

        String sql = "SELECT userId, password, name, email FROM USERS";
        return (List<User>) selectTemplate.query(sql, pss, rm);


    }

    public User findByUserId(String userId) throws SQLException {

        PreparedStatementSetter pss = pstmt -> {
            pstmt.setString(1, userId);
            return pstmt;
        };

        RowMapper rm = rs -> new User(
                rs.getString("userId"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email")
        );


        JdbcTemplate selectTemplate = new JdbcTemplate() {
        };

        String sql = "SELECT userId, password, name, email FROM USERS WHERE userId=?";
        return (User) selectTemplate.queryForObject(sql, pss, rm);


    }
}
