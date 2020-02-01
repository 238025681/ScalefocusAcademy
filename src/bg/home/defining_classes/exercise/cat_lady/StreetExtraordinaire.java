/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.cat_lady;

import java.text.DecimalFormat;

/**
 *
 * @author Chobi
 */
public class StreetExtraordinaire implements Cat {

    private String name;
    private double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        this.name = name;
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreetExtraordinaire ").append(name);
        sb.append(" ").append(new DecimalFormat("0.00").format(decibelsOfMeows));
        return sb.toString();
    }
}
