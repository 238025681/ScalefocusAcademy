/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.text_processing.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        char[] test = inputScaner.nextLine().toCharArray();
        String binaryNumber = "";
        
        for (int i = 0; i < test.length; i++) {
            binaryNumber += Integer.toBinaryString(test[i]);
        }
        System.out.println(binaryNumber);
    }
}
