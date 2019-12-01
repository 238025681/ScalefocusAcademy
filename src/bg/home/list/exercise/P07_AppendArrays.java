/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P07_AppendArrays {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] arrays = inputScaner.nextLine().trim().split("[\\s]*[|]+[\\s]*");
        List<int[]> numbersArrays = new ArrayList();
        for (int i = 0; i < arrays.length; i++) {
            numbersArrays.add(
                    Arrays
                            .stream(arrays[i].trim().split("\\s+"))
                            .filter(s -> !"".equals(s))
                            .mapToInt(s -> Integer.parseInt(s))
                            .toArray());
        }
        List<Integer> appendedArrays = new ArrayList();
        for (int i = numbersArrays.size() - 1; i >= 0; i--) {
            appendedArrays.addAll(Arrays
                    .stream(numbersArrays.get(i))
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
        }
        System.out.println(appendedArrays.toString().replaceAll("[\\[\\],]", ""));
    }
}
