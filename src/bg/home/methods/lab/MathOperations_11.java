/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class MathOperations_11 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstValue = Integer.parseInt(inputScanner.nextLine());
        String operator = inputScanner.nextLine();
        int secondValue = Integer.parseInt(inputScanner.nextLine());

        double result = calculate(firstValue, operator, secondValue);

        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double calculate(int firstValue, String operator, int secondValue) {
        int result = 0;
        switch (operator) {
            case "/":
                result = firstValue / secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
