/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.froggy;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Lake<Integer> lake = new Lake<>();
        String[] frogSteps = inputScaner.nextLine().replaceAll(",", " ").split("\\s+");
        for (int i = 0; i < frogSteps.length; i++) {
            lake.add(Integer.parseInt(frogSteps[i]));
        }
        StringJoiner result = new StringJoiner(", ");

        for (Integer step : lake) {
            result.add(step + "");
        }
        System.out.println(result);
    }

}
