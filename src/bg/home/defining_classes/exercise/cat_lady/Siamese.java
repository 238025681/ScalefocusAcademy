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
public class Siamese implements Cat {

    private String name;
    private double earSize;

    public Siamese(String name, double earSize) {
        this.name = name;
        this.earSize = earSize;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Siamese ").append(name);
        sb.append(" ").append(new DecimalFormat("0.00").format(earSize));
        return sb.toString();
    }

}
