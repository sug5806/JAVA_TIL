package core.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class SelectTemplate {

    public List query(String sql) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(sql);
            setValues(pstmt);

            rs = pstmt.executeQuery();

            List<Object> result = new ArrayList<>();

            while (rs.next()) {
                result.add(mapRow(rs));
            }

            return result;
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

    public Object queryForObject(String query) throws SQLException {
        List result = query(query);
        if (result.isEmpty()) {
            return null;
        }

        return result.get(0);
    }

    public abstract void setValues(PreparedStatement preparedStatement) throws SQLException;

    public abstract Object mapRow(ResultSet resultSet) throws SQLException;


}
