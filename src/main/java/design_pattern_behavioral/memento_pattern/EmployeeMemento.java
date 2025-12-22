package design_pattern_behavioral.memento_pattern;

// memento
public class EmployeeMemento {
    private String name;

    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name + " " + phone;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }
}
