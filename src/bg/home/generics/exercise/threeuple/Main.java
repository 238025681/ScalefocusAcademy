/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.threeuple;

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
        List<Threeuple> containter = new ArrayList<>();

        String[] input = inputScaner.nextLine().split("\\s+");
        String name = input[0] + " " + input[1];
        String addres = input[2];
        String town = input[3];

        Threeuple firstThreeuple = new Threeuple();
        firstThreeuple.setItem1(name);
        firstThreeuple.setItem2(addres);
        firstThreeuple.setItem3(town);

        input = inputScaner.nextLine().split("\\s+");
        Threeuple secondThreeuple = new Threeuple();
        boolean isDrink = "drunk".equals(input[2]);
        secondThreeuple.setItem1(input[0]);
        secondThreeuple.setItem2(Integer.parseInt(input[1]));
        secondThreeuple.setItem3(isDrink);
        input = inputScaner.nextLine().split("\\s+");
        Threeuple thirdThreeuple = new Threeuple();
        thirdThreeuple.setItem1(input[0]);
        thirdThreeuple.setItem2(Double.parseDouble(input[1]));
        thirdThreeuple.setItem3(input[2]);

        containter.add(firstThreeuple);
        containter.add(secondThreeuple);
        containter.add(thirdThreeuple);
        containter.forEach(items -> System.out.println(items));
    }
}
