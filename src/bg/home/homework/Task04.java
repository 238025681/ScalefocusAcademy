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
public class Task04 {
 
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int numberOfLines = inputScanner.nextInt();
        int result = 0;
        
        for (int i = 0; i < numberOfLines; i++) {
            
            result += (int)(inputScanner.next().charAt(0));
            
        }
        System.out.println(String.format("The sum equals: %d" ,result));
    }
}
