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
public class P04_ListManipulationBasics {

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
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.removeIf(n -> n == numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
                default:
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
