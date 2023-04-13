package peaksoft.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {
//        try (Statement statement = Util.connectDB().createStatement()) {
//            // нужен ли здесь автоинкремент у айди, если он прописан в аннотации?
//            statement.execute("CREATE TABLE IF NOT EXISTS User" +
//                    "(id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT," +
//                    "name VARCHAR(50) NOT NULL," +
//                    "lastName VARCHAR(50)," +
//                    "age TINYINT(3))");
//        } catch (SQLException e) {
//            System.out.println("Create table exception");
//            e.printStackTrace();
//        }
    }

    @Override
    public void dropUsersTable() {
//        try (Statement statement = Util.connectDB().createStatement()) {
//            statement.execute("DROP TABLE IF EXISTS User");
//        } catch (SQLException e) {
//            System.out.println("Drop table exception");
//            e.printStackTrace();
//        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        Session session = Util.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(new User(name, lastName, age));
//        session.getTransaction().commit();
//        session.close();
    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {



          return null;
    }

    @Override
    public void cleanUsersTable() {


    }
    }

