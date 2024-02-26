package org.example.OOP;

public class Employee {
    private String fullName;
    private int age;

    public Employee() {
        this.fullName = "null";
        this.age = 0;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.setFullName("Jane Smith");
        employee.setAge(30);
        String fullName  = employee.getFullName();
        int age = employee.getAge();
        System.out.println("Full Name: "+fullName+ " and the age as Age: " +age);


    }
}
