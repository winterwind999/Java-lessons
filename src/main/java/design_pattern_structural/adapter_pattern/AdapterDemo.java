package design_pattern_structural.adapter_pattern;

import java.util.List;

public class AdapterDemo {
    static void main() {
        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employees = employeeClient.getEmployeeList();

        System.out.println(employees);
    }
}
