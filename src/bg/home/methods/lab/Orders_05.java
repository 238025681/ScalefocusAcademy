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
public class Orders_05 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String product = inputScanner.nextLine();
        int quantity = Integer.parseInt(inputScanner.nextLine());

        double price = getPrice(product);

        printResult(quantity, price);
    }

    private static double getPrice(String product) {
        double result = 0d;

        switch (product) {

            case "coffee":
                result = 1.5;
                break;
            case "water":
                result = 1.0;
                break;
            case "coke":
                result = 1.4;
                break;
            case "snacks":
                result = 2.0;
                break;
            default:
                result = 0.0;
                break;
        }
        return result;
    }

    private static void printResult(int quantity, double price) {
        System.out.println(String.format("%.2f", quantity * price));
    }
}
