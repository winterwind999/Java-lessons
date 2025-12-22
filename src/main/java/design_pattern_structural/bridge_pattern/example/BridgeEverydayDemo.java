package design_pattern_structural.bridge_pattern.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {
    private static final String url = "jdbc:mysql://localhost:3306/java_design_pattern";
    private static final String user = "root";
    private static final String password = "1523";

    static void main() {
        try {
            // JDBC is an API
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // <- Driver

            Connection conn = DriverManager.getConnection(url, user, password) ;

            Statement statement = conn.createStatement();

            // This client is an abstraction and can work with any database that has a driver
            statement.execute("CREATE TABLE staff (ID int primary key, name varchar(255))");

            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
