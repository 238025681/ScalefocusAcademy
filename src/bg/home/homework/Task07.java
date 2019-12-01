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
public class Task07 {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int waterTankCapacity = 255;
        int capacity = 0;
        int lines = inputScanner.nextInt();
        for (int i = 0; i < lines; i++) {
            int quantitiesOfWater = inputScanner.nextInt();
            if (capacity + quantitiesOfWater > waterTankCapacity) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacity += quantitiesOfWater;

        }
        
        System.out.println(capacity);
    }
}
