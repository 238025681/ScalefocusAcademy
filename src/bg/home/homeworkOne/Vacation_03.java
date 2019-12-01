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
public class Vacation_03 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(inputScaner.nextLine());
        String group = inputScaner.nextLine();
        String day = inputScaner.nextLine();

        double price = getPrice(group, day);
        double result = numberOfPeople * price;
        if ("students".equals(group.toLowerCase()) && numberOfPeople >= 30) {
            result -= (result * 0.15);
        }
        if ("business".equals(group.toLowerCase()) && numberOfPeople >= 100) {
            result -= (price * 10);
        }
        if ("regular".equals(group.toLowerCase()) && numberOfPeople >= 10 && numberOfPeople <= 20) {
            result -= (result * 0.05);
        }
        System.out.println(String.format("Total price: %.2f", result));
    }

    private static double getPrice(String group, String day) {
        double result = 0d;
        double[] students = new double[]{8.45, 9.80, 10.46};
        double[] business = new double[]{10.90, 15.60, 16};
        double[] regular = new double[]{15, 20, 22.50};
        if ("students".equals(group.toLowerCase())) {
            if (null != day.toLowerCase()) {
                switch (day.toLowerCase()) {
                    case "friday":
                        result = students[0];
                        break;
                    case "saturday":
                        result = students[1];
                        break;
                    case "sunday":
                        result = students[2];
                        break;
                    default:
                        break;
                }
            }
        }
        if ("business".equals(group.toLowerCase())) {
            if (null != day.toLowerCase()) {
                switch (day.toLowerCase()) {
                    case "friday":
                        result = business[0];
                        break;
                    case "saturday":
                        result = business[1];
                        break;
                    case "sunday":
                        result = business[2];
                        break;
                    default:
                        break;
                }
            }
        }
        if ("regular".equals(group.toLowerCase())) {
            if (null != day.toLowerCase()) {
                switch (day.toLowerCase()) {
                    case "friday":
                        result = regular[0];
                        break;
                    case "saturday":
                        result = regular[1];
                        break;
                    case "sunday":
                        result = regular[2];
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

}
