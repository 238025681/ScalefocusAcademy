/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P04_AppliedArithmetic {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        Function<List<Integer>, List<Integer>> add = list -> {
            return list.stream().map(n -> n + 1).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        };
        Function<List<Integer>, List<Integer>> multiply = list -> {
            return list.stream().map(n -> n * 2).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        };
        Function<List<Integer>, List<Integer>> subtract = list -> {
            return list.stream().map(n -> n - 1).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        };
        Consumer<List<Integer>> print = list -> {
            System.out.println(list.toString().replaceAll("[\\[,\\]]", ""));
        };

        List<Integer> result = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        String command = "";
        while (!(command = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            switch (command.toLowerCase()) {
                case "add":
                    result = add.apply(result);
                    break;
                case "multiply":
                    result = multiply.apply(result);
                    break;
                case "subtract":
                    result = subtract.apply(result);
                    break;
                case "print":
                    print.accept(result);
                    break;
                default:
                    break;

            }
        }
    }

}
