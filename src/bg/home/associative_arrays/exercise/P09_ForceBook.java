/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P09_ForceBook {

    public static Map<String, Set<String>> forceBook = new TreeMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";

        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("lumpawaroo")) {

            String separator = getSeparator(input);
            executeCommand(input, separator);
        }
        
        

        forceBook
                .entrySet()
                .stream()
                .filter(f -> f.getValue().size() > 0)
                .sorted((f1, f2) -> {
                    if ((Integer.compare(f2.getValue().size(), f1.getValue().size())) == 0) {
                        return f1.getKey().compareTo(f2.getKey());
                    }
                    return Integer.compare(f2.getValue().size(), f1.getValue().size());
                })
                .forEach(f -> {

                    System.out.printf("Side: %s, Members: %d%n", f.getKey(), f.getValue().size());
                    f.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(u -> System.out.printf("! %s%n", u));

                });

    }

    /**
     * @param input string from input
     * @return separator contained in current string
     */
    private static String getSeparator(String input) {
        return input.contains(" | ") ? "|" : " -> ";
    }

    private static void executeCommand(String input, String separator) {

        String[] tokens = new String[2];
        String forceSide = "";
        String forceUser = "";

        switch (separator.trim()) {
            case "|":
                tokens = input.split("\\s+\\|\\s+");
                forceSide = tokens[0];
                forceUser = tokens[1];

                if (isNewUser(forceUser)) {
                    forceBook.computeIfAbsent(forceSide, f -> new TreeSet()).add(forceUser);
                }
                break;
            case "->":
                tokens = input.split(("\\s+\\->\\s+"));
                forceSide = tokens[1];
                forceUser = tokens[0];

                if (!isNewUserForFoceSide(forceSide, forceUser)) {
                    removeIfExisting(forceUser);
                }

                forceBook.computeIfAbsent(forceSide, f -> new LinkedHashSet()).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

                break;
            default:
                System.out.println(separator);
                break;
        }

    }

    private static boolean isNewUserForFoceSide(String forceSide, String forceUser) {
        return forceBook
                .entrySet()
                .stream()
                .filter(f -> !f.getKey().equals(forceSide))
                .noneMatch(f -> f.getValue()
                .stream()
                .filter(u -> u.equals(forceUser)).findFirst().isPresent());
    }

    private static boolean isNewUser(String forceUser) {
        return forceBook
                .entrySet()
                .stream()
                .noneMatch(f -> f.getValue()
                .stream()
                .filter(u -> u.equals(forceUser)).findFirst().isPresent());
    }

    private static Map removeIfExisting(String forceUser) {

        return forceBook
                .entrySet()
                .stream()
                .filter(f -> !f.getValue()
                .removeIf(s -> s.equals(forceUser)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o));

    }
}
