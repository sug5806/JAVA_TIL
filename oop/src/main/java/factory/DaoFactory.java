package factory;

import connection.ConnectionMaker;
import connection.DConnectionMaker;
import dao.UserDao;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = connectionMaker();
        return new UserDao(connectionMaker);
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
