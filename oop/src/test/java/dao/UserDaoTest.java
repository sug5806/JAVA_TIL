package dao;

import domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class UserDaoTest {

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        User user1 = new User("1", "name1", "password1");
        User user2 = new User("2", "name2", "password2");

        userDao.deleteAll();
        assertThat(userDao.getCount()).isEqualTo(0);

        userDao.add(user1);
        userDao.add(user2);
        assertThat(userDao.getCount()).isEqualTo(2);

        User userGet1 = userDao.get(user1.getId());
        assertThat(userGet1.getName()).isEqualTo(user1.getName());
        assertThat(userGet1.getPassword()).isEqualTo(user1.getPassword());

        User userGet2 = userDao.get(user2.getId());
        assertThat(userGet2.getName()).isEqualTo(userGet2.getName());
        assertThat(userGet2.getPassword()).isEqualTo(userGet2.getPassword());
    }

    @Test
    public void count() throws SQLException {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserDao dao = context.getBean("userDao", UserDao.class);
        User user1 = new User("1", "name1", "password1");
        User user2 = new User("2", "name2", "password2");
        User user3 = new User("3", "name3", "password3");

        dao.deleteAll();
        assertThat(dao.getCount()).isEqualTo(0);

        dao.add(user1);
        assertThat(dao.getCount()).isEqualTo(1);

        dao.add(user2);
        assertThat(dao.getCount()).isEqualTo(2);

        dao.add(user3);
        assertThat(dao.getCount()).isEqualTo(3);
    }
}