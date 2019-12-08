/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P07_StudentAcademy {

    public static Map<String, List<Double>> courses = new LinkedHashMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(inputScaner.nextLine());
        for (int i = 0; i < studentsCount; i++) {

            String name = inputScaner.nextLine();
            double grade = Double.parseDouble(inputScaner.nextLine());
            setStudentAndGrade(name, grade);
        }

        courses
                .entrySet()
                .stream()
                .filter(e -> e
                            .getValue()
                            .stream()
                            .mapToDouble(d -> d)
                            .average()
                            .getAsDouble() >= 4.5)
                            .sorted((e1, e2) -> {
                    return Double
                            .compare(
                                    e2.getValue()
                                            .stream()
                                            .mapToDouble(d -> d)
                                            .average()
                                            .getAsDouble(),
                                    e1.getValue()
                                            .stream()
                                            .mapToDouble(d -> d)
                                            .average()
                                            .getAsDouble());
                })
                .forEach(e -> {
                    System.out.printf("%s -> %.2f%n",
                             e.getKey(),
                             e.getValue()
                                    .stream()
                                    .mapToDouble(d -> d)
                                    .average()
                                    .getAsDouble());
                });

    }

    private static void setStudentAndGrade(String name, double grade) {
        String student = name;
        double currentGrade = grade;

        courses.computeIfAbsent(student, k -> new ArrayList()).add(currentGrade);

    }
}
