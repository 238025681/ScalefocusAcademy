/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.company_roster;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class CompanyRoster {

    public static Department departments = new Department();
    public static Map<String, List<Double>> averageSalary = new LinkedHashMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfEmployees = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numberOfEmployees; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            createEmployee(tokens);
        }
        String departmentWithHighestAverageSalary = averageSalary
                .entrySet()
                .stream()
                .sorted((d1, d2) -> Double.compare(d2.getValue().stream().mapToDouble(s -> s).average().getAsDouble(),
                d1.getValue().stream().mapToDouble(s -> s).average().getAsDouble())).findFirst().map(d -> d.getKey()).get();

        System.out.println("Highest Average Salary: " + departmentWithHighestAverageSalary);
        departments
                .getEmployee()
                .stream()
                .filter(e -> e.getDepartment().equals(departmentWithHighestAverageSalary))
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(e -> System.out.println(e.toString()));
    }

    private static void createEmployee(String[] tokens) {
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        String position = tokens[2];
        String department = tokens[3];
        String email = tokens.length >= 5 && tokens[4].contains("@") ? tokens[4] : "n/a";
        int age = tokens.length == 6 ? Integer.parseInt(tokens[5]) : -1;

        try {
            if (tokens.length == 5) {
                age = Integer.parseInt(tokens[4]);
            }
        } catch (NumberFormatException exception) {
            age = -1;
        }

        Employee currentEmployee = new Employee(name, salary, position, department, email, age);

        departments.addEmployee(currentEmployee);
        averageSalary.computeIfAbsent(department, s -> new ArrayList()).add(salary);
    }

    public static class Department {

        private List<Employee> employee;

        public Department() {
            this.employee = new ArrayList();
        }

        public List<Employee> getEmployee() {
            return employee;
        }

        public void addEmployee(Employee employee) {
            this.employee.add(employee);

        }

    }

    public static class Employee {

        private String name;
        private double salary;
        private String position;
        private String department;
        private String email;
        private int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d", this.getName(), this.getSalary(), this.getEmail(), this.getAge());
        }

    }
}
