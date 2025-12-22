package design_pattern_structural.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDb(1, "bryan");

        employees.add(employeeFromDb);

        // will not work! this is where the adapter comes into play!
        // Employee employeeFromLdap = new EmployeeLdap(2, "john");

        EmployeeLdap employeeFromLdap = new EmployeeLdap(2, "john");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("3,james");

        employees.add(new EmployeeAdapterCSV(employeeFromCSV) );

        return employees;
    }
}
