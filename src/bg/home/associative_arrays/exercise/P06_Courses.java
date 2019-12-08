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
public class P06_Courses {

    public static Map<String, List<String>> courses = new LinkedHashMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String input = "";
        while (!(input = inputScaner.nextLine()).toLowerCase().equals("end")) {

            String[] tokens = input.split(" : ");

            setCourseOrStudent(tokens);

        }

        courses
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    return Integer.compare(e2.getValue().size(), e1.getValue().size());
                })
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.printf("-- %s%n", s));

                });

       
    }

    private static void setCourseOrStudent(String[] tokens) {
        String cours = tokens[0];
        String student = tokens[1];

        courses.computeIfAbsent(cours, k -> new ArrayList<>()).add(student);

    }
}
