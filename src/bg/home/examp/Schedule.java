/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.examp;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Schedule {

    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int daysOfMonth = Integer.parseInt(inputScanner.nextLine());
        String[] schedule = new String[daysOfMonth];
        addWorkingHourPerEmployee(schedule);
        calculateDaysWithoutWork(schedule);

    }

    private static void addWorkingHourPerEmployee(String[] schedule) {
        for (int i = 0; i < schedule.length; i++) {
            schedule[i] = inputScanner.nextLine();
            if (Integer.parseInt(schedule[i]) != 0) {

                System.out.println(schedule[i]);
            }
        }
    }

    private static void calculateDaysWithoutWork(String[] schedule) {
        int days = 0;
        StringBuilder daysWithoutWork = new StringBuilder();
        for (int i = 0; i < schedule.length; i++) {
            if (Integer.parseInt(schedule[i]) == 0) {

                days++;
                daysWithoutWork.append(i + 1).append(System.lineSeparator());

            }
        }
        System.out.println(days);
        System.out.println(daysWithoutWork.toString().trim());
    }

}

