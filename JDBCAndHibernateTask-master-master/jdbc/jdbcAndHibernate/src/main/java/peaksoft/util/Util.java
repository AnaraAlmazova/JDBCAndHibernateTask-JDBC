package peaksoft.util;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import peaksoft.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "anara";
    private static SessionFactory sessionFactory;

    public static Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Ok");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }


//    public static SessionFactory getSessionFactory() {
//
//
//        if(sessionFactory == null) {
//            try {
//                Properties properties = new Properties();
//                properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//                properties.setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/postgres ");
//                properties.setProperty("hibernate.connection.username", "postgres");
//                properties.setProperty("hibernate.connection.password", "anara");
//                properties.setProperty("dialect", "org.hibernate.dialect.PostgreSQLDialect");
//
//                Configuration configuration = new Configuration()
//                        .addProperties(properties).addAnnotatedClass(User.class);
//                StandardServiceRegistryBuilder builder =
//                        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//                sessionFactory = configuration.buildSessionFactory(builder.build());
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//            }
//        }
//        return sessionFactory;
//    }


}
