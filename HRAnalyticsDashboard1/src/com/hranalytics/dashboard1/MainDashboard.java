package com.hranalytics.dashboard1;

import java.util.ArrayList;
import java.util.List;

public class MainDashboard {

    public static void main(String[] args) {
        System.out.println("HR Analytics Dashboard");

        // Load data
        List<Employee> employees = loadData();

        // Perform analyses
        analyzeEmployeeTurnover(employees);
        analyzePerformanceMetrics(employees);
    }

    // Method to simulate loading data
    public static List<Employee> loadData() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John Doe", "IT", 35, "Male", 4.5, false));
        employees.add(new Employee(2, "Jane Smith", "HR", 29, "Female", 3.8, true));
        employees.add(new Employee(3, "Alice Johnson", "Finance", 42, "Female", 4.2, false));
        employees.add(new Employee(4, "Bob Brown", "IT", 38, "Male", 4.0, true));
        employees.add(new Employee(5, "Charlie Davis", "HR", 45, "Male", 2.9, false));

        System.out.println("Data loaded successfully.");
        return employees;
    }

    // Method to analyze employee turnover
    public static void analyzeEmployeeTurnover(List<Employee> employees) {
        int totalEmployees = employees.size();
        int employeesLeft = 0;

        for (Employee emp : employees) {
            if (emp.hasLeftCompany()) {
                employeesLeft++;
            }
        }

        double turnoverRate = ((double) employeesLeft / totalEmployees) * 100;
        System.out.println("Employee Turnover Rate: " + turnoverRate + "%");
    }

    // Method to analyze performance metrics
    public static void analyzePerformanceMetrics(List<Employee> employees) {
        double totalPerformance = 0.0;

        for (Employee emp : employees) {
            totalPerformance += emp.getPerformanceRating();
        }

        double averagePerformance = totalPerformance / employees.size();
        System.out.println("Average Performance Rating: " + averagePerformance);
    }
}
