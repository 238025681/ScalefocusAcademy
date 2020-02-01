/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.abstraction.cards_with_power;

/**
 *
 * @author Chobi
 */
public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private CardSuits(int number) {
        this.power = number;
    }

    public int getPower() {
        return power;
    }

}
