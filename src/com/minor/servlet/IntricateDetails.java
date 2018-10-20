package com.minor.servlet;
public class IntricateDetails {
    private int age, salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        IntricateDetails intricateDetails = new IntricateDetails();
        intricateDetails.setAge(27);
        intricateDetails.getAge();
    }
}



