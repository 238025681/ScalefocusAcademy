/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P11_TPRF {

   public static List<String> namesList;
    public static List<String> bannNamesList;
    public static String pattern;

    public static Predicate<String> contains = name -> {
        return name.matches("\\w*" + pattern + "\\w*");
    };
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
        bannNamesList = new ArrayList<>();
        namesList = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        String inputString = "";
        while (!(inputString = inputScaner.nextLine()).equalsIgnoreCase("print")) {

            String[] tokens = inputString.split(";");

            String command = tokens[0];

            if ("remove filter".equalsIgnoreCase(command)) {
                removeNames(tokens);
            } else if ("add filter".equalsIgnoreCase(command)) {
                addNames(tokens);
            }

        }
        StringBuilder finalGuestList = new StringBuilder();
        for (String name : namesList) {
            if (!bannNamesList.contains(name)) {
                finalGuestList.append(name).append(" ");
            }
        }
        finalGuestList.trimToSize();
        System.out.println(finalGuestList.toString());

    }

    private static void removeNames(String[] tokens) {
        String condition = tokens[1].toLowerCase();
        pattern = tokens[2];
        List<String> removeList = new ArrayList<>();
        for (String string : bannNamesList) {
            switch (condition) {

                case "starts with":
                    if (startsWith.test(string)) {
                        removeList.add(string);
                    }
                    break;
                case "ends with":
                    if (endWith.test(string)) {
                        removeList.add(string);
                    }
                    break;
                case "length":
                    if (withLength.test(string)) {
                        removeList.add(string);
                    }
                case "contains":
                    if (contains.test(string)) {
                        removeList.add(string);
                    }
                    break;
                default:
                    break;
            }
        }
        bannNamesList.removeAll(removeList);
    }

    private static void addNames(String[] tokens) {

        String condition = tokens[1].toLowerCase();
        pattern = tokens[2];

        for (String string : namesList) {
            switch (condition) {

                case "starts with":
                    if (startsWith.test(string)) {
                        bannNamesList.add(string);
                    }
                    break;
                case "ends with":
                    if (endWith.test(string)) {
                        bannNamesList.add(string);
                    }
                    break;
                case "length":
                    if (withLength.test(string)) {
                        bannNamesList.add(string);
                    }
                case "contains":
                    if (contains.test(string)) {
                        bannNamesList.add(string);
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
