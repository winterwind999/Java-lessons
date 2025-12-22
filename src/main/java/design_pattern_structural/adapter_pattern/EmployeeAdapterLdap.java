package design_pattern_structural.adapter_pattern;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap employeeLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeLdap = employeeFromLdap;
    }

    @Override
    public int getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getName() {
        return employeeLdap.getName();
    }

    public String toString() {
        return "ID: " + employeeLdap.getCn() + ", Name: " + employeeLdap.getName();
    }
}
