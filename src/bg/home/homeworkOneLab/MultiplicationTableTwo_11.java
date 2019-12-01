/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOneLab;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class MultiplicationTableTwo_11 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = Integer.parseInt(inputScanner.nextLine());
        int times = Integer.parseInt(inputScanner.nextLine());
        if (10 < times) {
            System.out.println(String.format("%d X %d = %d", number, times, (number * times)));
            return;
        }
        for (int i = times; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", number, i, number * i));
        }

    }
}
