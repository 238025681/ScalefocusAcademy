/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P07_FindTheSmallestElement {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> numbers = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        Function<List<Integer>, Integer> findSmallestnumber = num -> {
            int bestIndex = 0;
            int smallestNumber = num.get(0);
            for (int i = 1; i < num.size(); i++) {
                if (smallestNumber >= num.get(i)) {
                    smallestNumber = num.get(i);
                    bestIndex = i;
                }
            }
            return bestIndex;
        };

        System.out.println(findSmallestnumber.apply(numbers));
    }

}
