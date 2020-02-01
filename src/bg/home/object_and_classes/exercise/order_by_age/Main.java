/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.order_by_age;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    private static List<Person> persons;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        persons = new ArrayList<>();
        String input = "";

        while (!(input = inputScaner.nextLine()).toLowerCase().equals("end")) {

            String[] tokens = input.split("\\s+");
            createPerson(tokens);
        }
        persons
                .stream()
                .sorted((p1, p2) -> p1.compareTo(p2))
                .forEach(p -> System.out.println(p.toString()));
    }

    private static void createPerson(String[] tokens) {
        String name = tokens[0];
        String id = tokens[1];
        int age = Integer.parseInt(tokens[2]);
        Person person = new Person(name, id, age);
        persons.add(person);
    }
}
