/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.abstraction.card_rank;

/**
 *
 * @author Chobi)_9
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (Card value : Card.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.ordinal(),value.name());
        }
    }  
}
