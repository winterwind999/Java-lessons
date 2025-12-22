package design_pattern_structural.adapter_pattern;

public class EmployeeLdap {
    private int cn;
    private String name;

    public EmployeeLdap(int cn, String name) {
        this.cn = cn;
        this.name = name;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
