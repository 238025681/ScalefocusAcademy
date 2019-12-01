/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class SmallestOfThreeNumbers_01 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int firstnumber = Integer.parseInt(inputScaner.nextLine());
        int secondnumber = Integer.parseInt(inputScaner.nextLine());
        int thirdnumber = Integer.parseInt(inputScaner.nextLine());

        int result = getSmallestOfThreeNumber(firstnumber, secondnumber, thirdnumber);
        System.out.println(result);
    }

    private static int getSmallestOfThreeNumber(int firstnumber, int secondnumber, int thirdnumber) {
        int smallestNumber = Integer.MIN_VALUE;
        if (Integer.compare(firstnumber, secondnumber) <= 0) {
            smallestNumber = firstnumber;
        } else {
            smallestNumber = secondnumber;
        }
        return Integer.compare(smallestNumber, thirdnumber) <= 0 ? smallestNumber : thirdnumber;
    }
}
