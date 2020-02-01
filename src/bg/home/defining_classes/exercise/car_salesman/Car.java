/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.car_salesman;

/**
 *
 * @author Chobi
 */
public class Car {

    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    /*
    
    FordFocus:
V4-33:
Power: 140
Displacement: 28
Efficiency: B
Weight: 1300
Color: Silver
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model).append(":").append(System.lineSeparator());
        sb.append(engine).append(System.lineSeparator());
        if (this.weight == 0) {

            sb.append("Weight: ").append("n/a").append(System.lineSeparator());;
        } else {

            sb.append("Weight: ").append(weight).append(System.lineSeparator());;
        }
        sb.append("Color: ").append(color);
        return sb.toString();
    }

}
