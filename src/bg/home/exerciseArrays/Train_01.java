/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class Train_01 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numOfTrains = Integer.parseInt(inputScanner.nextLine());
        int[] trains = new int[numOfTrains];
        for (int i = 0; i < numOfTrains; i++) {
            trains[i] = Integer.parseInt(inputScanner.nextLine());
        }

        int sumOfTrains = Arrays.stream(trains).sum();
        IntStream outputTrains = Arrays.stream(trains);
        outputTrains.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println("");
        System.out.println(sumOfTrains);
    }
}
