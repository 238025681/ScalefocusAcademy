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
class Engine {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(power).append(System.lineSeparator());
        if (this.displacement == 0) {
            sb.append("Displacement: ").append("n/a").append(System.lineSeparator());

        } else {
            sb.append("Displacement: ").append(this.displacement).append(System.lineSeparator());

        }
        sb.append("Efficiency: ").append(this.efficiency);
        return sb.toString();
    }

}
