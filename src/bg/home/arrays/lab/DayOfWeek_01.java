/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.arrays.lab;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class DayOfWeek_01 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = Integer.parseInt(inputScaner.nextLine());
        if (day > 7 || day < 1) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(String.format("%s", dayOfWeek[day - 1]));
        }
    }

}
