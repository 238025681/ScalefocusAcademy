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
public class SportCar extends Car{
    
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(10.0);
    }
    
}
