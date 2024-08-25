package com.hranalytics.dashboard1;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private String gender;
    private double performanceRating;
    private boolean leftCompany;

    public Employee(int id, String name, String department, int age, String gender, double performanceRating, boolean leftCompany) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.performanceRating = performanceRating;
        this.leftCompany = leftCompany;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    public boolean hasLeftCompany() {
        return leftCompany;
    }
}
