/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    private static List<Student> students;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        students = new ArrayList();
        int numberOfStudents = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            String[] tokens = inputScaner.nextLine().split(" ");
            createStudent(tokens);
        }
        
        students
                .stream()
                .sorted((s1,s2)->Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(s -> System.out.println(s.toString()));
    }

    private static void createStudent(String[] tokens) {
        String firstName = tokens[0];
        String lastName = tokens[1];
        double grade = Double.parseDouble(tokens[2]);
        Student student = new Student(firstName, lastName, grade);
        students.add(student);
    }
}
