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
public class P03_BigFactorial {
    
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());
        BigInteger result = BigInteger.valueOf(number);
        for (int i = number-1; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
                    
        }
        System.out.println(result);
    }
}
