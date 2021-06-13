package next.dao;

import core.jdbc.JdbcTemplate;
import next.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserDao.class);

    public void insert(User user) throws SQLException {
        JdbcTemplate insertJdbcTemplate = new JdbcTemplate();
        String query = "INSERT INTO USERS VALUES (?, ?, ?, ?)";
        insertJdbcTemplate.update(query, user.getUserId(), user.getPassword(), user.getName(), user.getEmail());
    }

    public void update(User user) {
        JdbcTemplate updateJdbcTemplate = new JdbcTemplate();
        String query = "UPDATE USERS SET userId=?, password=?, name=?, email=? WHERE userId=?";
        updateJdbcTemplate.update(query, user.getUserId(), user.getPassword(), user.getName(), user.getEmail(), user.getUserId());
    }

    public List<User> findAll() throws SQLException {
        String sql = "SELECT userId, password, name, email FROM USERS";

        JdbcTemplate selectTemplate = new JdbcTemplate();
        return selectTemplate.query(sql, rs -> new User(
                rs.getString("userId"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email")
        ));
    }

    public User findByUserId(String userId) {
        String sql = "SELECT userId, password, name, email FROM USERS WHERE userId=?";

        JdbcTemplate selectTemplate = new JdbcTemplate();

        return selectTemplate.queryForObject(sql, (ResultSet rs) -> new User(
                rs.getString("userId"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email")
        ), userId);
    }
}
