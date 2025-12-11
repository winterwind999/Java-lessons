package design_pattern_creational.singleton_pattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    static void main() throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();
        Connection conn = instance.getConnection();
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE students (ID int primary key, name varchar(255))");
        System.out.println("Created students table");
        int rows = statement.executeUpdate("INSERT INTO students (ID, name) VALUES (1, 'Brian')");
        if (rows > 0) {
            System.out.println("Inserted a new row");
        }
        conn.close();
    }
}
