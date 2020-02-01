/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.opinion_poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfPersons = Integer.parseInt(inputScaner.nextLine());
        List<Person> persons = new ArrayList();
        for (int i = 0; i < numberOfPersons; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            Person currentPerson = new Person(tokens[0], Integer.parseInt(tokens[1]));
            persons.add(currentPerson);
        }

        persons
                .stream()
                .filter(p -> p.getAge() > 30)
                .sorted((p1, p2) -> p1.compareTo(p2))
                .forEach(p -> System.out.println(p.toString()));
    }
}
