/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.vehicle_catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    private static List<Vehicle> vehicles;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";
        vehicles = new ArrayList();
        while (!(input = inputScaner.nextLine()).toLowerCase().equals("end")) {

            String[] tokens = input.split("\\s+");

            createVehicle(tokens);
        }

        while (!(input = inputScaner.nextLine()).toLowerCase().equals("close the catalogue")) {
            String model = input;
            vehicles
                    .stream()
                    .filter(v -> v.getModel().equals(model))
                    .forEach(v -> System.out.println(v.toString()));
        }

        double carAverageHorsepower = vehicles
                .stream()
                .filter(v -> v.getType().toLowerCase().equals("car"))
                .mapToDouble(v -> v.getHorsepower()).average().orElse(0);
        
        double truckAverageHorsepower = vehicles
                .stream()
                .filter(v -> v.getType().toLowerCase().equals("truck"))
                .mapToDouble(v -> v.getHorsepower()).average().orElse(0);
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carAverageHorsepower));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckAverageHorsepower));
    }

    private static void createVehicle(String[] tokens) {
        String type = tokens[0];
        String model = tokens[1];
        String color = tokens[2];
        double horsepower = Double.parseDouble(tokens[3]);
        Vehicle vehicle = new Vehicle(capitalize(type), capitalize(model), color, horsepower);
        vehicles.add(vehicle);
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
