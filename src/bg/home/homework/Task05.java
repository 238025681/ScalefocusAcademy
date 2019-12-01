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
public class Task05 {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        int firstChar = inputScanner.nextInt();
        int secondChar = inputScanner.nextInt();
        int diffrence = secondChar - firstChar;
        for (int i = 0; i <= diffrence; i++) {
            System.out.print((char)firstChar++ + " ");
        }
        
    }
}
