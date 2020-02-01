/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.generic_swap_method_strings;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numOfLine = Integer.parseInt(inputScaner.nextLine());
        Box container = new Box();

        for (int i = 0; i < numOfLine; i++) {

            container.setSourse(Integer.parseInt(inputScaner.nextLine()));
        }

        int[] coordinates = Stream.of(inputScaner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        container.swapElement(coordinates[0], coordinates[1]);
        System.out.println(container);
    }
}
