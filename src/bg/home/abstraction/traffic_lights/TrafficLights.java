/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.abstraction.traffic_lights;

/**
 *
 * @author Chobi
 */
public enum TrafficLights {
    RED(0),
    GREEN(1),
    YELLOW(2);

    private int power;

    private TrafficLights(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public static TrafficLights getByCodice(int power) {
        for (TrafficLights light : values()) {
            if (light.power == power) {
                return light;
            }
        }
        throw new IllegalArgumentException("Invalid codice: " + power);
    }
}
