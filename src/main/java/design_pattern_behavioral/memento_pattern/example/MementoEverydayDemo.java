package design_pattern_behavioral.memento_pattern.example;

import java.io.*;

public class MementoEverydayDemo {
    static void main() {
        Employee employee = new Employee();

        employee.setName("Bryan");

        serialize(employee);

        Employee emp = deserialize();

        System.out.println(emp);
    }

    private static void serialize(Employee employee) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserialize() {
        Employee employee = null;
        try (FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            employee = (Employee) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return employee;
    }
}

// originator
class Employee implements Serializable {
    private String name;

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}