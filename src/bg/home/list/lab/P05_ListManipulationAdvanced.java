/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P05_ListManipulationAdvanced {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String line = inputScaner.nextLine();

            if (line.toLowerCase().equals("end")) {
                break;
            }

            String[] tokens = line.trim().split("\\s+");

            switch (tokens[0].trim()) {
                case "Contains":
                    containsChecker(numbers, tokens[1]);
                    break;
                case "Print":
                    print(numbers, tokens[1]);
                    break;
                case "Get":
                    getSum(numbers);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    filterCollection(numbers, condition, number);
                    break;
                default:
                    break;
            }
        }
    }

    public static void containsChecker(List<Integer> list, String element) {
        if (list.contains(Integer.parseInt(element))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void print(List<Integer> list, String evenOrOdd) {
        switch (evenOrOdd) {
            case "even":
                System.out.println(
                        list.stream()
                                .filter(s -> s % 2 == 0)
                                .collect(Collectors.toList())
                                .toString().replaceAll("[\\[\\],]", ""));
                break;
            case "odd":
                System.out.println(
                        list.stream()
                                .filter(s -> s % 2 != 0)
                                .collect(Collectors.toList())
                                .toString().replaceAll("[\\[\\],]", ""));
                break;
            default:
                break;

        }
    }

    private static void getSum(List<Integer> numbers) {
        System.out.println(numbers.stream().reduce(0, Integer::sum));

    }

    private static void filterCollection(List<Integer> list, String condition, int number) {
        switch (condition) {

            case ">":
                System.out.println(
                        list.stream()
                                .filter(n -> n > number)
                                .collect(Collectors.toList())
                                .toString()
                                .replaceAll("[\\[\\],]", ""));
                break;
            case "<":
                System.out.println(
                        list.stream()
                                .filter(n -> n < number)
                                .collect(Collectors.toList())
                                .toString()
                                .replaceAll("[\\[\\],]", ""));
                break;
            case ">=":
                System.out.println(
                        list.stream()
                                .filter(n -> n >= number)
                                .collect(Collectors.toList())
                                .toString()
                                .replaceAll("[\\[\\],]", ""));
                break;
            case "<=":
                System.out.println(
                        list.stream()
                                .filter(n -> n <= number)
                                .collect(Collectors.toList())
                                .toString()
                                .replaceAll("[\\[\\],]", ""));
                break;
            default:
                break;
        }
    }
}
