package design_pattern_structural.adapter_pattern;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private String id;
    private String name;

    public EmployeeCSV(String values) {
        StringTokenizer stringTokenizer = new StringTokenizer(values, ",");
        if (stringTokenizer.hasMoreElements()) {
            id = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            name = stringTokenizer.nextToken();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
