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
public class VendingMachine_07 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = inputScaner.nextLine();
        double totalCoins = 0d;
        while (!"Start".equals(input)) {
            double currentCoin = Double.parseDouble(input);
            if (currentCoin == 0.1
                    || currentCoin == 0.2
                    || currentCoin == 0.5
                    || currentCoin == 1
                    || currentCoin == 2) {

                totalCoins += currentCoin;
            } else {
                System.out.println(String.format("Cannot accept %.2f", currentCoin));
            }
            input = inputScaner.nextLine();
        }
        input = inputScaner.nextLine();
        while (!"End".equals(input)) {

            double price = getPrice(input);
            if (price == 0d) {
                System.out.println("Invalid product");
            } else if (price > totalCoins) {
                System.out.println("Sorry, not enough money");
            } else {
                System.out.println(String.format("Purchased %s", input));
                totalCoins -= price;
            }

            input = inputScaner.nextLine();
        }
        System.out.println(String.format("Change: %.2f", totalCoins));

    }

    private static double getPrice(String input) {
        double price = 0d;
        switch (input) {
            case "Nuts":
                price = 2.0;
                break;
            case "Water":
                price = 0.7;
                break;
            case "Crisps":
                price = 1.5;
                break;
            case "Soda":
                price = 0.8;
                break;
            case "Coke":
                price = 1.0;
                break;
            default:
                break;
        }
        return price;
    }
}
