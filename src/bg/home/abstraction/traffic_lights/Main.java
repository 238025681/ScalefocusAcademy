/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.abstraction.traffic_lights;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] lights = inputScaner.nextLine().split("\\s+");
        int lines = Integer.parseInt(inputScaner.nextLine());
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            for (String light : lights) {
                int power = TrafficLights.valueOf(light).getPower();
                result
                        .append(TrafficLights.getByCodice((power + i) % TrafficLights.values().length))
                        .append(" ");
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());
    }
}
