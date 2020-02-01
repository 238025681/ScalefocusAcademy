/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.google;

import java.text.DecimalFormat;

/**
 *
 * @author Chobi
 */
public class Company {

    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(name)
                .append(" ")
                .append(department)
                .append(" ")
                .append(new DecimalFormat("0.00")
                        .format(salary)).append(System.lineSeparator());
        return sb.toString();
    }

}
