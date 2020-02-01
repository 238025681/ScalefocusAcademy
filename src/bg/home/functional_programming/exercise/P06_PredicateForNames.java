/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P06_PredicateForNames {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int pattern = Integer.parseInt(inputScaner.nextLine());
        List<String> names = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        Predicate<String> divisible = name -> name.length() <= pattern;

        names
                .stream()
                .filter(divisible)
                .forEach(name -> System.out.println(name));
    }

}
