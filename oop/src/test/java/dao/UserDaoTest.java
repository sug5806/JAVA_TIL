package dao;

import domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class UserDaoTest {

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("asdf");
        user.setName("name");
        user.setPassword("1234");

        userDao.add(user);

        User user1 = userDao.get(user.getId());

        assertThat(user1.getName()).isEqualTo(user1.getName());
        assertThat(user1.getPassword()).isEqualTo(user1.getPassword());
    }
}