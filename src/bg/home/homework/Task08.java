/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homework;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Task08 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int lines = inputScanner.nextInt();
        String winer = "";
        double bestCapacity = 0;
        for (int i = 0; i < lines; i++) {
            inputScanner.nextLine();
            String name = inputScanner.nextLine();
            double radius = inputScanner.nextDouble();
            int height = inputScanner.nextInt();

            double result = Math.PI * Math.pow(radius, 2) * height;
            if (result > bestCapacity) {
                winer = name;
                bestCapacity = result;
            }
        }
        System.out.println(winer);
    }
}
