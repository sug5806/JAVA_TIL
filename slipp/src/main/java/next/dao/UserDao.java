package next.dao;

import core.jdbc.ConnectionManager;
import core.jdbc.JdbcTemplate;
import next.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final Logger log = LoggerFactory.getLogger(UserDao.class);

    public void insert(User user) throws SQLException {

        JdbcTemplate jdbcTemplate = new JdbcTemplate() {
            @Override
            public void setValues(PreparedStatement pstmt) throws SQLException {
                pstmt.setString(1, user.getUserId());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getName());
                pstmt.setString(4, user.getEmail());
            }
        };

        String query = "INSERT INTO USERS VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(query);
    }

    public void update(User user) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate() {
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

        jdbcTemplate.update(query);
    }

    public List<User> findAll() throws SQLException {
        // TODO 구현 필요함.
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();

        try {
            con = ConnectionManager.getConnection();
            String sql = "SELECT * FROM USERS";
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            User user = null;
            while (rs.next()) {
                String userId = rs.getString("userId");
                String password = rs.getString("password");
                String name = rs.getString("name");
                String email = rs.getString("email");

                user = new User(userId, password, name, email);

                userList.add(user);
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return userList;
    }

    public User findByUserId(String userId) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = ConnectionManager.getConnection();
            String sql = "SELECT userId, password, name, email FROM USERS WHERE userid=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userId);

            rs = pstmt.executeQuery();

            User user = null;
            if (rs.next()) {
                user = new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
                        rs.getString("email"));
            }

            return user;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
}
