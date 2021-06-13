package core.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
    PreparedStatement setValues(PreparedStatement pstmt) throws SQLException;
}
