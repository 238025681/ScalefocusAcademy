/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P02_AMinerTask {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Map<String, Long> resources = new LinkedHashMap();

        while (true) {

            String resource = inputScaner.nextLine();
            if ("stop".equals(resource.toLowerCase())) {
                break;
            }
            long quantity = Long.parseLong(inputScaner.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {

                resources.put(resource, quantity + resources.get(resource));

            }

        }
        resources
                .entrySet()
                .stream()
                .forEach(r -> System.out.println(String.format("%s -> %d", r.getKey(), r.getValue())));
    }
}
