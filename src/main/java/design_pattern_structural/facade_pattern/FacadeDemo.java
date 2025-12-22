package design_pattern_structural.facade_pattern;

import design_pattern_creational.singleton_pattern.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class FacadeDemo {
    static void main() {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted");

        List<Gremlin> gremlins = jdbcFacade.getGremlins();

        for (Gremlin gremlin : gremlins) {
            System.out.println(gremlin.id() + " " + gremlin.name());
        }
    }

//    static void main() {
//        DbSingleton dbSingleton = DbSingleton.getInstance();
//
//        try {
//            Connection conn = dbSingleton.getConnection();
//
//            Statement sta = conn.createStatement();
//
//            int count = sta.executeUpdate("CREATE TABLE gremlim (id int primary key, name varchar(255))");
//
//            System.out.println("Table created");
//            sta.close();
//
//            sta = conn.createStatement();
//            count = sta.executeUpdate("INSERT INTO gremlim (id, name) VALUES (1, 'zanium')");
//            System.out.println(count + " record(s) created");
//            sta.close();
//
//            sta = conn.createStatement();
//            ResultSet rs = sta.executeQuery("SELECT * FROM gremlim");
//
//            while(rs.next()) {
//                System.out.println(rs.getString(1) + " " + rs.getString(2));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
