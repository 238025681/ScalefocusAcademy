/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NeedForSpeed;

/**
 *
 * @author Chobi
 */
public class Car extends Vehicle {

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(3.0);
    }

}
