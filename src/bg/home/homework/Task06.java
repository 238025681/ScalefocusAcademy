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
public class Task06 {
    public static void main(String[] args) {
        Scanner inputScanner =new Scanner(System.in);
        int number = inputScanner.nextInt();
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                char firstChar = (char)('a'+i);
                char secondChar = (char)('a'+j);
                char thirdChar = (char)('a'+k);
                    System.out.printf("%c%c%c%n",firstChar, secondChar,thirdChar);
                }
            }
            
        }
        
        
        
    }
    
}
