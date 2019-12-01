/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class ZigZagArrays_03 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(inputScaner.nextLine());
        int[] firstArr = new int[numOfLines], secondArr = new int[numOfLines];
        for (int i = 0; i < numOfLines; i++) {
            String[] input = inputScaner.nextLine().split(" ");
            if (i%2 == 0) {
            firstArr[i] = Integer.parseInt(input[0]);
            secondArr[i] = Integer.parseInt(input[1]);
                
            }else{
            firstArr[i] = Integer.parseInt(input[1]);
            secondArr[i] = Integer.parseInt(input[0]);
            }
        }
        System.out.println(" " + Arrays.toString(firstArr).replaceAll("[\\[|\\]|,]", ""));
        System.out.println(" " + Arrays.toString(secondArr).replaceAll("[\\[|\\]|,]", ""));

    }
}
