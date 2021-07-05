package factory;

import connection.ConnectionMaker;
import connection.DConnectionMaker;
import dao.UserDao;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
