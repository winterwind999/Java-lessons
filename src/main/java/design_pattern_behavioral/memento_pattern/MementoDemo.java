package design_pattern_behavioral.memento_pattern;

public class MementoDemo {
    static void main() {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();
        employee.setName("John Wick");
        employee.setPhone("123");

        System.out.println("Employee before save");

        caretaker.save(employee);

        employee.setPhone("456");

        System.out.println("Employee after changed phone numer save: " + employee);

        employee.setPhone("789");

        caretaker.revert(employee);

        System.out.println("Reverts to last save point: " + employee);

        caretaker.revert(employee);

        System.out.println("Reverted to original: " + employee);
    }
}
