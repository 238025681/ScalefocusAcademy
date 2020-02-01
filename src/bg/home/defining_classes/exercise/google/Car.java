/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.google;

/**
 *
 * @author Chobi
 */
public class Car {

    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(model)
                .append(" ")
                .append(speed).append(System.lineSeparator());
        return sb.toString();
    }
}
