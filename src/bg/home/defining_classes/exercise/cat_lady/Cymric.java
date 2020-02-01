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
public class Cymric implements Cat {

    private String name;
    private double furLength;

    public Cymric(String name, double furLength) {
        this.name = name;
        this.furLength = furLength;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cymric ").append(name);
        sb.append(" ").append(new DecimalFormat("0.00").format(furLength));
        return sb.toString();
    }
}
