package next.dao;

import core.jdbc.JdbcTemplate;
import next.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserDao.class);

    public void insert(User user) throws SQLException {

        JdbcTemplate insertJdbcTemplate = new JdbcTemplate() {
            @Override
            public Object mapRow(ResultSet resultSet) throws SQLException {
                return null;
            }

            @Override
            public void setValues(PreparedStatement pstmt) throws SQLException {
                pstmt.setString(1, user.getUserId());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getName());
                pstmt.setString(4, user.getEmail());
            }
        };

        String query = "INSERT INTO USERS VALUES (?, ?, ?, ?)";

        insertJdbcTemplate.update(query);
    }

    public void update(User user) throws SQLException {
        JdbcTemplate updateJdbcTemplate = new JdbcTemplate() {
            @Override
            public Object mapRow(ResultSet resultSet) throws SQLException {
                return null;
            }

            @Override
            public void setValues(PreparedStatement pstmt) throws SQLException {
                pstmt.setString(1, user.getUserId());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getName());
                pstmt.setString(4, user.getEmail());
                pstmt.setString(5, user.getUserId());
            }
        };

        String query = "UPDATE USERS SET userId=?, password=?, name=?, email=? WHERE userId=?";

        updateJdbcTemplate.update(query);
    }

    public List<User> findAll() throws SQLException {

        JdbcTemplate selectTemplate = new JdbcTemplate() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {

            }

            @Override
            public Object mapRow(ResultSet resultSet) throws SQLException {
                return new User(
                        resultSet.getString("userId"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getString("email")

                );
            }
        };

        String sql = "SELECT userId, password, name, email FROM USERS";
        return (List<User>) selectTemplate.query(sql);


    }

    public User findByUserId(String userId) throws SQLException {

        JdbcTemplate selectTemplate = new JdbcTemplate() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1, userId);
            }

            @Override
            public Object mapRow(ResultSet resultSet) throws SQLException {
                return new User(
                        resultSet.getString("userId"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getString("email")
                );
            }
        };

        String sql = "SELECT userId, password, name, email FROM USERS WHERE userId=?";
        return (User) selectTemplate.queryForObject(sql);


    }
}
