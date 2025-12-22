package design_pattern_structural.adapter_pattern;

public class EmployeeAdapterCSV implements Employee {
    private final EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public int getId() {
        return Integer.parseInt(employeeCSV.getId());
    }

    @Override
    public String getName() {
        return employeeCSV.getName();
    }

    @Override
    public String toString() {
        return "ID: " + employeeCSV.getId() + ", Name: " + employeeCSV.getName();
    }
}
