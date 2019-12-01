/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homework;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        char[] inputNumber = inputScan.nextLine().toCharArray();
        int result= 0;
        for (int i = 0; i < inputNumber.length; i++) {

            result = result + Integer.parseInt(String.valueOf(inputNumber[i]));
        }
        
        System.out.println(result);
        
        
        
        
    }
    
}
