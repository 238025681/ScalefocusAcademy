/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P02_GaussTrick {

    //input 1 2 3 4 5
    //output 6 6 3
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(inputScaner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> finalResult = new ArrayList<>();

        int sectionOfArray = (numbers.size() / 2);
        int lastIndexOfArray = (numbers.size() - 1);

        for (int i = 0, j = lastIndexOfArray; i < sectionOfArray; i++) {
            int sum = numbers.get(i) + numbers.get(j);
            numbers.remove(j);
            numbers.remove(i);
            numbers.add(i, sum);

            j = (numbers.size() - 1);
        }

        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
