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
public class Task10 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int pokePower = inputScanner.nextInt();
        int pokeTarget = inputScanner.nextInt();
        byte exhaustionFactor = inputScanner.nextByte();
        int currentPower = pokePower;
        int colectedPoke = 0;
        while (pokeTarget <= currentPower) {

            currentPower -= pokeTarget;
            colectedPoke++;
            boolean percentage = currentPower * 2 == pokePower;
            if (percentage) {
                if (exhaustionFactor < currentPower && exhaustionFactor != 0) {

                    currentPower = currentPower / exhaustionFactor;
                }
            }
            if (currentPower < pokeTarget) {
                break;
            }
        }
        System.out.println(currentPower);
        System.out.println(colectedPoke);
    }

}
