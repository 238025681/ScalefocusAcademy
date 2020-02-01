/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.generic_box;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numOfLine = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numOfLine; i++) {

            Box result = new Box(Integer.parseInt(inputScaner.nextLine()));
            System.out.println(result);
        }
    }
}
