/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Chobi
 */
public class P01_CountRealNumbers {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        double[] nums = Arrays
                .stream(inputScaner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        TreeMap<Double, Integer> counts = new TreeMap();

        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);

        }
        
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {

            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
