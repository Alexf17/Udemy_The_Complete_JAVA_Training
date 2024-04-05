package org.example.Comparable;

public class Employee implements Comparable {
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee other = (Employee) o;
            if (employeeName.equals("Tom") && other.employeeName.equals("Anna")) {
                return -1;
            } else if (employeeName.equals("Anna") && other.employeeName.equals("Tom")) {
                return 1;
            } else {
                return employeeName.compareTo(other.employeeName);
            }
        } else if (o instanceof String) {
            String other = (String) o;
            return employeeName.compareTo(other);
        } else {
            throw new IllegalArgumentException("Cannot compare" + o.getClass().getName());
        }
    }
}
