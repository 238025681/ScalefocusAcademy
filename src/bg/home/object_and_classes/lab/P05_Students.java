package bg.home.object_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P05_Students {

    public static List<Student> students = new ArrayList();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input= inputScaner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            createStudent(tokens);
            
            input= inputScaner.nextLine();
        }
        String town = inputScaner.nextLine().toLowerCase();
        students
                .stream()
                .filter(student -> town.equals(student.getHometown()))
                .forEach(student -> System.out.println(student.toString()));

    }

    private static void createStudent(String[] tokens) {

        String firstName = tokens[0];
        String lastName = tokens[1];
        int age = Integer.parseInt(tokens[2]);
        String hometown = tokens[3].toLowerCase();
        Student currentStudent = new Student(firstName, lastName, age, hometown);
        students.add(currentStudent);
    }

    public static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {

            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setAge(age);
            this.setHometown(hometown);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        @Override
        public String toString() {
            return String
                    .format("%s %s is %d years old",
                            this.getFirstName(),
                            this.getLastName(),
                            this.getAge());
        }

    }
}
