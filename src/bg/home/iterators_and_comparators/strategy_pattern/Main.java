/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.strategy_pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Set<Person> sortByName = new TreeSet(new ComparatorByLenght());
        Set<Person> sortByAge = new TreeSet(new ComparatorByAge());
        int numOflines = Integer.parseInt(inputScaner.nextLine());
        for (int i = 0; i < numOflines; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            Person currentPerson = new Person(tokens[0], Integer.parseInt(tokens[1]));
            sortByAge.add(currentPerson);
            sortByName.add(currentPerson);
        }
        sortByName.forEach(p -> System.out.println(p));
        sortByAge.forEach(p -> System.out.println(p));
    }
}
