/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOne;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class PrintAndSum_04 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int startNumber = Integer.parseInt(inputScaner.nextLine());
        int endNumber = Integer.parseInt(inputScaner.nextLine());
        int result = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            result += i;
            if (i == endNumber) {
                System.out.println(i);
            } else {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("Sum: " + result);
    }
}
