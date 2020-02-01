package bg.home.object_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P06_Students2 {

    public static List<Student> students = new ArrayList();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = inputScaner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            createStudent(tokens);

            input = inputScaner.nextLine();
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
        if (isStudentExisting(firstName, lastName)) {
            Student overwriteStudent = students
                    .stream()
                    .filter(student -> student.getFirstName().equals(firstName)
                    && student.getLastName().equals(lastName))
                    .findFirst().get();

            overwriteStudent.setFirstName(firstName);
            overwriteStudent.setLastName(lastName);
            overwriteStudent.setAge(age);
            overwriteStudent.setHometown(hometown);

        } else {
            Student currentStudent = new Student(firstName, lastName, age, hometown);
            students.add(currentStudent);
        }
    }

    public static boolean isStudentExisting(String firstName, String lastName) {

        for (Student student : students) {

            if ((student.getFirstName().equals(firstName))
                    && (student.getLastName().equals(lastName))) {
                return true;

            }
        }
        return false;
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

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + this.age;
            hash = 29 * hash + Objects.hashCode(this.hometown);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (!Objects.equals(this.firstName, other.firstName)) {
                return false;
            }
            if (!Objects.equals(this.lastName, other.lastName)) {
                return false;
            }
            return true;
        }

    }
}
