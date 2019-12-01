/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P11_ArrayManipulator {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int[] numbers = Arrays.stream(inputScaner.nextLine().split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s)).toArray();
        String input = "";
        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] commands = input.split(" ");

            if (commands.length == 2) {
                if (commands[0].toLowerCase().charAt(0) == 'm') {
                    executeCommand(numbers, commands[0], commands[1]);
                } else {
                    numbers = executeCommand(numbers, commands[0], Integer.parseInt(commands[1]));
                }
            } else {
                executeCommand(numbers, commands[0], Integer.parseInt(commands[1]), commands[2]);

            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void executeCommand(int[] numbers, String command, String elementType) {
        int indexForNumber = Integer.MIN_VALUE;
        switch (command) {
            case "max":
                indexForNumber = maxValue(numbers, elementType);
                break;
            case "min":
                indexForNumber = minValue(numbers, elementType);
                break;
            default:
                break;
        }

        if (indexForNumber == Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(indexForNumber);
        }
    }

    private static int[] executeCommand(int[] numbers, String command, int index) {

        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
            return numbers;
        }

        int[] result = new int[numbers.length];
        int separator = index + 1;
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[(i + separator) % numbers.length];
        }
        return result;
    }

    private static void executeCommand(int[] numbers, String command, int index, String elementType) {
        if (index > numbers.length) {
            System.out.println("Invalid count");
            return;
        }
        if (elementType.equalsIgnoreCase("even")) {
            int[] temp = Arrays.stream(numbers)
                    .filter(s -> s % 2 == 0).toArray();
            getFirsOrLastNumbers(command, temp, index);
        }

        if (elementType.equalsIgnoreCase("odd")) {
            int[] temp = Arrays.stream(numbers)
                    .filter(s -> s % 2 != 0).toArray();
            getFirsOrLastNumbers(command, temp, index);
        }
        /*
        last {count} even/odd – returns the last {count} elements 
        -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
	If the count is greater than the array length, print “Invalid count”
	If there are not enough elements to satisfy the count, print as many as you can. 
        If there are zero even/odd elements, print an empty array “[]”
         */
    }

    public static void getFirsOrLastNumbers(String command, int[] temp, int index) {
        if (command.equalsIgnoreCase("first")) {

            System.out.println(Arrays.toString(Arrays.stream(temp)
                    .limit(index).toArray())
            );

        } else {
            int skipIndex = (temp.length - index) < 0 ? 0 : (temp.length - index);
            System.out.println(Arrays.toString(Arrays.stream(temp)
                    .skip(skipIndex).toArray())
            );

        }
    }

    private static int minValue(int[] numbers, String elementType) {
        int minNumber = Integer.MAX_VALUE;
        int indexForMinNumber = Integer.MAX_VALUE;
        //max even/odd– returns the INDEX of the max even/odd element 
        //-> [1, 4, 8, 2, 3] -> max odd -> print 4
        for (int i = 0; i < numbers.length; i++) {
            if (elementType.equalsIgnoreCase("even") && (numbers[i] % 2) == 0) {
                if (minNumber >= numbers[i]) {
                    minNumber = numbers[i];
                    indexForMinNumber = i;
                }

            } else if (elementType.equalsIgnoreCase("odd") && (numbers[i] % 2) != 0) {
                if (minNumber >= numbers[i]) {
                    minNumber = numbers[i];
                    indexForMinNumber = i;
                }
            }
        }
        return indexForMinNumber == Integer.MAX_VALUE ? Integer.MIN_VALUE : indexForMinNumber;
    }

    public static int maxValue(int[] numbers, String elementType) {
        int maxNumber = Integer.MIN_VALUE;
        int indexForMaxNumber = Integer.MIN_VALUE;
        //max even/odd– returns the INDEX of the max even/odd element 
        //-> [1, 4, 8, 2, 3] -> max odd -> print 4  
        for (int i = 0; i < numbers.length; i++) {
            if (elementType.equalsIgnoreCase("even") && (numbers[i] % 2) == 0) {
                if (maxNumber <= numbers[i]) {
                    maxNumber = numbers[i];
                    indexForMaxNumber = i;
                }

            } else if (elementType.equalsIgnoreCase("odd") && (numbers[i] % 2) != 0) {
                if (maxNumber <= numbers[i]) {
                    maxNumber = numbers[i];
                    indexForMaxNumber = i;
                }
            }
        }
        return indexForMaxNumber;
    }

}
