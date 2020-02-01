/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.raw_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(inputScaner.nextLine());

        List<Car> cars = new ArrayList<>();
        Predicate<List<Tire>> checkPressure = tire -> {
            return !tire.stream().noneMatch(t -> t.getPressure() < 1);
        };
        Predicate<Engine> checkPower = power -> {
            return power.getPower() > 250;
        };
        for (int i = 0; i < numberOfCars; i++) {

            String[] tokens = inputScaner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoType, cargoWeight);

            List<Tire> tires = new ArrayList<>();
            tires.add(new Tire(tire1Age, tire1Pressure));
            tires.add(new Tire(tire2Age, tire2Pressure));
            tires.add(new Tire(tire3Age, tire3Pressure));
            tires.add(new Tire(tire4Age, tire4Pressure));

            cars.add(new Car(model, engine, cargo, tires));
        }

        String command = inputScaner.nextLine();

        if ("fragile".equalsIgnoreCase(command)) {

            cars
                    .stream()
                    .filter(c -> (c.getCargo().getType().equals("fragile")) && checkPressure.test(c.getTires()))
                    .forEach(c -> System.out.println(c.getModel()));
        } else if ("flamable".equalsIgnoreCase(command)) {
            cars
                    .stream()
                    .filter(c -> (c.getCargo().getType().equals("flamable")) && checkPower.test(c.getEngine()))
                    .forEach(c -> System.out.println(c.getModel()));

        }
    }
}
