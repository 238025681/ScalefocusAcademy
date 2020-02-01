/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.comparing_objects;

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
        List<Person> persons = new ArrayList<>();
        String input = "";
        while (!"end".equalsIgnoreCase((input = inputScaner.nextLine()))) {
            String[] tokens = input.split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            persons.add(person);
        }
        int index = Integer.parseInt(inputScaner.nextLine());
        if (index >= persons.size() || index < 0) {
            System.out.println("No matches");
        } else {

            Person pattern = persons.get(index);
            int numOfEqual = 0;
            for (Person person : persons) {
                if (pattern.compareTo(person) == 1) {
                    numOfEqual++;
                }
            }
            if (numOfEqual > 0) {
                System.out.printf("%d %d %d%n", numOfEqual, persons.size() - numOfEqual, persons.size());
            } else {

                System.out.println("No matches");
            }
        }
    }
}
