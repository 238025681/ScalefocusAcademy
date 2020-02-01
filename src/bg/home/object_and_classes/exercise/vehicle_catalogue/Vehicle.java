/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.vehicle_catalogue;

import java.text.DecimalFormat;

/**
 *
 * @author Chobi
 */
public class Vehicle {

    private String type;
    private String model;
    private String color;
    private double horsepower;

    public Vehicle(String type, String model, String color, double horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        DecimalFormat dec = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type);
        sb.append(System.lineSeparator());
        sb.append("Model: ").append(model);
        sb.append(System.lineSeparator());
        sb.append("Color: ").append(color);
        sb.append(System.lineSeparator());
        sb.append("Horsepower: ").append(dec.format(horsepower));
        return sb.toString();
    }

}
