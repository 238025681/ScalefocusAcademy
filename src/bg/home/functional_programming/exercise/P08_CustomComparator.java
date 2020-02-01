/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P08_CustomComparator {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Integer[] numbers = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(Integer::valueOf).toArray(Integer[]::new);

        Comparator<Integer> oddEveComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
                    return -1;
                }

                return 0;
            }
        };
        Comparator<Integer> oddEvenOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0) && (o2 % 2 == 0)) {
                    return o1.compareTo(o2);
                }
                if ((o1 % 2 != 0) && (o2 % 2 != 0)) {
                    return o1.compareTo(o2);
                }
                return 0;
            }
        };

        Arrays.sort(numbers, oddEveComparator);
        Arrays.sort(numbers, oddEvenOrder);
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));

    }

}
