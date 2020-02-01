/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P02_KnightsOfHonor {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        Consumer<List<String>> inputPrinter = list -> {
            list.stream().forEach(name -> System.out.println("Sir "+name));
        };
        inputPrinter.accept(Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .collect(Collectors.toList()));
    }

}
