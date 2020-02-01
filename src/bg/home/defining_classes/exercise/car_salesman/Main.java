/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.car_salesman;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(inputScaner.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numOfLines; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            Engine currentEngine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
            if (tokens.length >= 3) {
                try {

                    currentEngine.setDisplacement(Integer.parseInt(tokens[2]));
                } catch (Exception e) {
                    currentEngine.setEfficiency(tokens[2]);
                }
            }
            if (tokens.length == 4) {
                currentEngine.setEfficiency(tokens[3]);
            }
            engines.put(currentEngine.getModel(), currentEngine);
        }

        numOfLines = Integer.parseInt(inputScaner.nextLine());
        for (int i = 0; i < numOfLines; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            Car currentCar = new Car(tokens[0], engines.get(tokens[1]));

            if (tokens.length >= 3) {
                try {

                    currentCar.setWeight(Integer.parseInt(tokens[2]));
                } catch (Exception e) {
                    currentCar.setColor(tokens[2]);
                }
            }
            if (tokens.length == 4) {
                currentCar.setColor(tokens[3]);
            }
            cars.add(currentCar);
        }
        cars.forEach(c -> System.out.println(c));
    }
}
