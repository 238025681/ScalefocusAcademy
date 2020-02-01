/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P05_ReverseAndExclude {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> numbers = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        int pattern = Integer.parseInt(inputScaner.nextLine());
        Predicate<Integer> divisible = num -> num % pattern != 0;

        numbers = numbers
                .stream()
                .filter(divisible)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        Collections.reverse(numbers);
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

}
