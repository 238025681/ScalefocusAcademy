/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.tuple;

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
        List<Tuple> containter = new ArrayList<>();

        String[] input = inputScaner.nextLine().split("\\s+");
        Tuple firstTuple = new Tuple(input[0] + " " + input[1], input[2]);
        input = inputScaner.nextLine().split("\\s+");
        Tuple secondTuple = new Tuple(input[0], Integer.parseInt(input[1]));
        input = inputScaner.nextLine().split("\\s+");
        Tuple thirdTuple = new Tuple(Integer.parseInt(input[0]), Double.parseDouble(input[1]));
        containter.add(firstTuple);
        containter.add(secondTuple);
        containter.add(thirdTuple);
        containter.forEach(items -> System.out.println(items));
    }
}
