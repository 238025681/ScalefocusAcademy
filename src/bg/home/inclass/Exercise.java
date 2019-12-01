package bg.home.inclass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chobi
 */
public class Exercise {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String inputNumber = inputScaner.nextLine();

        int[] argumentsArr = Arrays
                .stream(inputNumber.split(" "))
                .mapToInt(s -> Integer.parseInt(s)).toArray();

        List<Integer> argumentsList = Arrays.
                stream(inputNumber.split(" "))
                .mapToInt(s -> Integer.parseInt(s))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(sum(argumentsArr));
        System.out.println(sum(argumentsList));
    }

    public static double sum(int[] inputNumber) {
        double result = 0;

        for (int i = 0; i < inputNumber.length; i++) {

            result += squareHalf(inputNumber[i], 2);

        }
        return result;
    }

    public static double sum(List<Integer> inputNumber) {
        double result = 0;

        for (int i = 0; i < inputNumber.size(); i++) {

            result += squareHalf(inputNumber.get(i), 2);

        }
        return result;
    }

    public static double squareHalf(int number, int power) {
        int divider = (int) Math.pow(2, power);

        return (Math.pow(number, power) / divider);
    }

}
