/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * @author Chobi
 */
public class LadyBugs_10 {

    static boolean[] bugsField;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int arrLength = Integer.parseInt(inputScaner.nextLine());
        if (arrLength == 0) {
            return;
        }

        bugsField = new boolean[arrLength];
        int[] bugs = Arrays
                .stream(inputScaner.nextLine().split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        for (int i = 0; i < bugs.length; i++) {
            if (bugs[i] < bugsField.length && bugs[i] >= 0) {
                bugsField[bugs[i]] = Boolean.TRUE;
            }
        }

        String[] moves = inputScaner.nextLine().split("\\s+");
        while (!moves[0].toLowerCase().equals("end")) {
            int index = Integer.parseInt(moves[0]);
            String direction = moves[1].toLowerCase();
            int steps = Integer.parseInt(moves[2]);

            if (index <= (bugsField.length - 1) && index >= 0) {

                moveBugs(index, direction, steps);

            }
            moves = inputScaner.nextLine().split("\\s+");
        }

        StringJoiner result = new StringJoiner(" ");
        for (int i = 0; i < bugsField.length; i++) {
            if (bugsField[i]) {
                result.add("1");
            } else {
                result.add("0");

            }
        }
        System.out.println(result);
    }

    private static void moveBugs(int index, String direction, int steps) {
        if (steps < 0) {
            if (direction.equals("right")) {
                direction = "left";
            } else {
                direction = "right";
            }
        }
        switch (direction) {
            case "right":
                if (bugsField[index]) {
                    bugsField[index] = !bugsField[index];
                    for (int i = index + Math.abs(steps); i < bugsField.length; i+=steps) {
                        if (!bugsField[i]) {
                            bugsField[i] = !bugsField[i];
                            break;
                        }
                    }
                }
                break;
            case "left":
                if (bugsField[index]) {
                    bugsField[index] = !bugsField[index];
                    for (int i = index - (Math.abs(steps)); i >= 0; i-= steps) {

                        if (!bugsField[i]) {
                            bugsField[i] = !bugsField[i];
                            break;
                        }
                    }
                }
                break;

            default:
                break;
        }
    }
}
