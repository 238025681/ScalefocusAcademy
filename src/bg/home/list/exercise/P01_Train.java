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
public class P01_Train {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        List<Integer> vagons = Arrays.stream(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int vagonCapacity = Integer.parseInt(inputScaner.nextLine());
        String input = "";
        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 1) {
                int passengers = Integer.parseInt(tokens[0]);
                addPassengers(vagons, vagonCapacity, passengers);
                continue;
            }
            vagons.add(Integer.parseInt(tokens[1]));

        }
        System.out.println(vagons.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void addPassengers(List<Integer> vagons, int vagonCapacity, int passengers) {
        for (int i = 0; i < vagons.size(); i++) {
            if ((vagons.get(i) + passengers) <= vagonCapacity) {
                int newValueOfPassengers = vagons.get(i) + passengers;
                vagons.remove(i);
                vagons.add(i, newValueOfPassengers);
                break;
            }

        }
    }
}
