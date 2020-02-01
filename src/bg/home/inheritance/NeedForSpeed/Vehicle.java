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
public class Vehicle {
    
    protected final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int horsePower;
    
    public Vehicle(double fuel, int horsePower) {
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        this.fuel = fuel;
        this.horsePower = horsePower;
    }
    
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    
    public double getFuel() {
        return fuel;
    }
    
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public int getHorsePower() {
        return horsePower;
    }
    
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    public void drive(double kilometers) {
        if (kilometers > 0) {
            
        double consumation = this.getFuelConsumption() * kilometers;
            if (consumation <= this.getFuel()) {
                this.fuel -= consumation;
            }
        }
        
    }
}
