package factory;

import connection.ConnectionMaker;
import connection.DConnectionMaker;
import dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        ConnectionMaker connectionMaker = connectionMaker();
        return new UserDao(connectionMaker);
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}