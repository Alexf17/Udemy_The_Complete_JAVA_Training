package org.example.Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom");
        Employee[] employeeArray = {new Employee("Sara"), new Employee("Tom"),
                new Employee("Anna"), new Employee("John")};

        Arrays.sort(employeeArray);
        System.out.println(Arrays.toString(employeeArray));
        System.out.println("result = "+ employee1.compareTo("Mary"));
    }

}
