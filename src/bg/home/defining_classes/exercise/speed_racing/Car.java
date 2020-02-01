/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.speed_racing;

import java.text.DecimalFormat;

/**
 *
 * @author Chobi
 */
public class Car {

    private String model;
    private double fuel_amount;
    private double fuel_cost;
    private int distance;

    public Car(String model, double fuel_amount, double fuel_cost) {
        this.model = model;
        this.fuel_amount = fuel_amount;
        this.fuel_cost = fuel_cost;
        this.distance = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuel_amount() {
        return fuel_amount;
    }

    private double getFuel_cost() {
        return fuel_cost;
    }

    public int getDistance() {
        return distance;
    }

    private void setFuel_amount(double fuel_amount) {
        this.fuel_amount -= fuel_amount;
    }

    public void setDistance(int distance) {
        if (reduceFuel(distance)) {
            this.distance += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    private boolean reduceFuel(double distance) {

        if ((distance * this.getFuel_cost()) > this.getFuel_amount()) {
            return false;
        }
        this.setFuel_amount(distance * this.fuel_cost);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model);
        sb.append(" ").append(new DecimalFormat("0.00").format(this.getFuel_amount()));
        sb.append(" ").append(distance);
        return sb.toString();
    }

}
