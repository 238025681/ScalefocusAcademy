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
public class P03_MergingLists {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> firstArray = Arrays.stream(inputScaner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondArray = Arrays.stream(inputScaner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> mergingLists = new ArrayList();
        int minListSize = firstArray.size() < secondArray.size() ? firstArray.size() : secondArray.size();

        for (int i = 0, j = 0; i < minListSize; i++) {

            mergingLists.add(firstArray.get(j));
            mergingLists.add(secondArray.get(j));
            firstArray.remove(j);
            secondArray.remove(j);
        }
        if (firstArray.size() > 0) {
            mergingLists.addAll(firstArray);
        }
        if (secondArray.size() > 0) {
            mergingLists.addAll(secondArray);
        }
        System.out.println(mergingLists.toString().replaceAll("[\\[,\\]]", ""));
    }
}
