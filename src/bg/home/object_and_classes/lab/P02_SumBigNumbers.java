/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.lab;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        BigInteger inputFirsNumber = new BigInteger(inputScaner.nextLine());
        BigInteger inputSecondNumber = new BigInteger(inputScaner.nextLine());
        
        System.out.println(inputFirsNumber.add(inputSecondNumber));
    }
}
