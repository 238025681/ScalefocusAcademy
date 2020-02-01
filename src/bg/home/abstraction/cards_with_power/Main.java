/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.abstraction.cards_with_power;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String card = inputScaner.nextLine();
        String suit = inputScaner.nextLine();

        System.out.printf("Card name: %s of %s; Card power: %d%n",
                 Card.valueOf(card),
                 CardSuits.valueOf(suit),
                 Card.valueOf(card).getPower() + CardSuits.valueOf(suit).getPower());
    }
}
