/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String type = inputScanner.nextLine();
        String firstValue = inputScanner.nextLine();
        String secondValue = inputScanner.nextLine();

        switch (type.toLowerCase()) {
            case "int":

                int firstArgument = Integer.parseInt(firstValue);
                int secondArgument = Integer.parseInt(secondValue);

                System.out.println(getmax(firstArgument, secondArgument));
                break;
            case "char":

                System.out.println(getmax(firstValue.charAt(0), secondValue.charAt(0)));
                break;
            case "string":
                System.out.println(getmax(firstValue, secondValue));
                break;
            default:
                break;
        }

    }

    private static int getmax(int firstValue, int secondValue) {
        return firstValue > secondValue ? firstValue : secondValue;
    }

    private static String getmax(String firstValue, String secondValue) {

        if (firstValue.compareTo(secondValue) >= 0) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    private static char getmax(char firstValue, char secondValue) {
        return (int) firstValue > (int) secondValue ? firstValue : secondValue;
    }
}
