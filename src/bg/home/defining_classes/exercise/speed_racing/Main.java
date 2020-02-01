/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.speed_racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(inputScaner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String[] tokens = inputScaner.nextLine().split("\\s+");
            Car car = new Car(tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            cars.put(car.getModel(), car);
        }

        String command = "";
        while (!(command = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = command.split("\\s+");
            cars.get(tokens[1]).setDistance(Integer.parseInt(tokens[2]));
        }
        cars.entrySet().stream().forEach(c -> System.out.println(c.getValue().toString()));
    }

}
