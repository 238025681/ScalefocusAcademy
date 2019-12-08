/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Chobi
 */
public class P10_SoftUniExamResults {

    public static Map<String, Integer> users = new TreeMap();
    public static Map<String, Integer> submissions = new TreeMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";

        while (!(input = inputScaner.nextLine()).equals("exam finished")) {

            String[] tokens = input.split("-");
            if (tokens.length > 2) {
                String user = tokens[0];
                String language = tokens[1];
                int result = Integer.parseInt(tokens[2]);

                addUserResult(user, result);
                updateSubmission(language);
            } else if (tokens.length == 2) {
                users.remove(tokens[0]);
            }
        }
        System.out.println("Results:");
        users.entrySet()
                .stream()
                .sorted((u1, u2) -> {
                    if ((u2.getValue().compareTo(u1.getValue())) != 0) {

                        return u2.getValue().compareTo(u1.getValue());
                    } else {

                        return u1.getKey().compareTo(u2.getKey());
                    }

                })
                .forEach(s -> {
                    System.out.printf("%s | %d%n", s.getKey(), s.getValue());
                });

        System.out.println("Submissions:");

        submissions.entrySet()
                .stream()
                .sorted((u1, u2) -> {
                    if ((u2.getValue().compareTo(u1.getValue())) != 0) {

                        return u2.getValue().compareTo(u1.getValue());
                    } else {

                        return u1.getKey().compareTo(u2.getKey());
                    }

                })
                .forEach(s -> {
                    System.out.printf("%s - %d%n", s.getKey(), s.getValue());

                });

    }

    private static void addUserResult(String user, int result) {
        if (users.containsKey(user) && (result > users.get(user))) {

            users.put(user, result);
        }
        if (!users.containsKey(user)) {

            users.put(user, result);
        }

    }

    private static void updateSubmission(String language) {

        if (submissions.containsKey(language)) {
            submissions.put(language, submissions.get(language) + 1);

        } else {
            submissions.put(language, 1);
        }
    }
}
