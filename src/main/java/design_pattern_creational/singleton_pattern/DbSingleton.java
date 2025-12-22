package design_pattern_creational.singleton_pattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {
    private String url = "jdbc:mysql://localhost:3306/java_design_pattern";
    private String user = "root";
    private String password = "1523";
    private Connection conn = null;

    // outdated
    // private static DbSingleton instance = new DbSingleton();

    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static DbSingleton getInstance() {
        // outdated
        // return instance;

        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }
}
