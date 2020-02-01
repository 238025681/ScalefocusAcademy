/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.count_method_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(inputScaner.nextLine());
        List<Box> container = new ArrayList<>();
        for (int i = 0; i < numOfLines; i++) {
            container.add(new Box(Double.parseDouble(inputScaner.nextLine())));
        }
        Box pattern = new Box(Double.parseDouble(inputScaner.nextLine()));
        int count = 0;
        for (int i = 0; i < container.size(); i++) {
            if (container.get(i).compareTo(pattern) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
