/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.cat_lady;

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
        Map<String, Cat> cats = new LinkedHashMap<>();
        String input = "";

        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");
            Cat currentCat = null;
            switch (tokens[0]) {
                case "StreetExtraordinaire":
                    currentCat = new StreetExtraordinaire(tokens[1], Double.parseDouble(tokens[2]));
                    break;
                case "Siamese":
                    currentCat = new Siamese(tokens[1], Double.parseDouble(tokens[2]));
                    break;
                case "Cymric":
                    currentCat = new Cymric(tokens[1], Double.parseDouble(tokens[2]));
                    break;
                default:
                    break;
            }
            cats.put(currentCat.getName(), currentCat);
        }
        input = inputScaner.nextLine();
        System.out.println(cats.get(input));
    }
}
