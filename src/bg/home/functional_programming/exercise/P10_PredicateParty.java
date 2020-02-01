/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P10_PredicateParty {

    public static List<String> namesList;
    public static String pattern;
    public static Predicate<String> startsWith = name -> {
        return name.matches("^" + pattern + "\\w*");
    };
    public static Predicate<String> endWith = name -> {
        return name.matches("\\w*" + pattern + "$");
    };
    public static Predicate<String> withLength = name -> {
        return name.length() == Integer.parseInt(pattern);
    };

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        namesList = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        String inputString = "";
        while (!(inputString = inputScaner.nextLine()).equalsIgnoreCase("party!")) {

            String[] tokens = inputString.split("\\s+");

            String command = tokens[0];

            if ("remove".equalsIgnoreCase(command)) {
                eraseNames(tokens);
            } else if ("double".equalsIgnoreCase(command)) {
                multiplyNames(tokens);
            }

        }
        Collections.sort(namesList);
        if (namesList.size() > 0) {

            System.out.println(namesList.toString().replaceAll("[\\[\\]]", "") + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }

    }

    private static void eraseNames(String[] tokens) {
        String condition = tokens[1].toLowerCase();
        pattern = tokens[2];

        switch (condition) {

            case "startswith":
                namesList = namesList.stream().filter(s -> !startsWith.test(s)).collect(Collectors.toList());
                break;
            case "endswith":
                namesList = namesList.stream().filter(s -> !endWith.test(s)).collect(Collectors.toList());
                break;
            case "length":
                namesList = namesList.stream().filter(s -> !withLength.test(s)).collect(Collectors.toList());
                break;
            default:
                break;

        }
    }

    private static void multiplyNames(String[] tokens) {

        String condition = tokens[1].toLowerCase();
        pattern = tokens[2];
        List<String> newCustomers = new ArrayList();

        for (String string : namesList) {
            switch (condition) {

                case "startswith":
                    if (startsWith.test(string)) {
                        newCustomers.add(string);
                    }
                    break;
                case "endswith":
                    if (endWith.test(string)) {
                        newCustomers.add(string);
                    }
                    break;
                case "length":
                    if (withLength.test(string)) {
                        newCustomers.add(string);
                    }
                    break;
                default:
                    break;
            }
        }
        namesList.addAll(newCustomers);
    }

}
