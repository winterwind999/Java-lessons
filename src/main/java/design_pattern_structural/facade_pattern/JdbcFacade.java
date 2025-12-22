package design_pattern_structural.facade_pattern;

import design_pattern_creational.singleton_pattern.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton dbSingleton = null;

    public JdbcFacade() {
        dbSingleton = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = dbSingleton.getConnection();

            Statement sta = conn.createStatement();

            count = sta.executeUpdate("CREATE TABLE gremlim (id int primary key, name varchar(255))");

            System.out.println("Table created");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = dbSingleton.getConnection();

            Statement sta = conn.createStatement();

            count = sta.executeUpdate("INSERT INTO gremlim (id, name) VALUES (1, 'zanium')");

            System.out.println("Update executed");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Gremlin> getGremlins() {
        List<Gremlin> gremlins = new ArrayList<>();
        try {
            Connection conn = dbSingleton.getConnection();

            Statement sta = conn.createStatement();

            ResultSet rs = sta.executeQuery("SELECT * FROM gremlim");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }

            rs.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gremlins;
    }
}

record Gremlin (String id, String name){}