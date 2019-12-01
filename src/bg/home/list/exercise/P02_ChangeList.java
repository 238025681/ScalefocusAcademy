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
public class P02_ChangeList {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = "";

        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equalsIgnoreCase("Delete")) {
                int elementToDelete = Integer.parseInt(tokens[1]);
                numbers.remove(Integer.valueOf(elementToDelete));
                continue;
            }
            if (tokens[0].equalsIgnoreCase("Insert")) {
                int elementToInsert = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                if (position >=0 && position < numbers.size()) {
                   
                numbers.add(position, elementToInsert);
                }
            }

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
