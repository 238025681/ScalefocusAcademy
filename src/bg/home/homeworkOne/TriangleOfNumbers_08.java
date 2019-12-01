/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOne;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * @author Chobi
 */
public class TriangleOfNumbers_08 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());

        for (int i = 1; i <= number; i++) {
            StringJoiner tree = new StringJoiner(" ");
            for (int j = 0; j < i; j++) {
                tree.add(i + "");
            }
            System.out.println(tree);
        }
    }
}
