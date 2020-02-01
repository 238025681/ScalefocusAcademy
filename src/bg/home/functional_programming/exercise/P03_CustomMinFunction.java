/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

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
public class P03_CustomMinFunction {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        Function<List<Integer>, Integer> minValue = list -> {
            return list.stream().sorted((s1, s2) -> s1.compareTo(s2)).findFirst().get();
        };

        Consumer<List<String>> inputPrinter = list -> {
            list.stream().forEach(name -> System.out.println("Sir " + name));
        };
       int result =  minValue.apply(Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList()));
        System.out.println(result);
    }

}
