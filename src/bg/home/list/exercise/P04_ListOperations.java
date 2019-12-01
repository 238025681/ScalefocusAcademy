/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P04_ListOperations {

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
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove < 0 || indexToRemove >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(indexToRemove);
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int stepsToMOve = Integer.parseInt(tokens[2]);

                    if (direction.equalsIgnoreCase("left")) {
                        moveLeft(stepsToMOve, numbers);
                    }

                    if (direction.equalsIgnoreCase("right")) {
                        moveRight(stepsToMOve, numbers);
                    }

                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if (indexToInsert < 0 || indexToInsert >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(indexToInsert, numberToInsert);
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }

    public static void moveLeft(int stepsToMOve, List<Integer> numbers) {
        for (int i = 0; i < stepsToMOve; i++) {

            int element = numbers.get(0);
            numbers.add(element);
            numbers.remove(0);
        }
    }

    public static void moveRight(int stepsToMOve, List<Integer> numbers) {
        for (int i = 0; i < stepsToMOve; i++) {

            int element = numbers.get(numbers.size() - 1);
            numbers.add(0, element);
            numbers.remove(numbers.size() - 1);
        }
    }
}
