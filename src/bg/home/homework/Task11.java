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
public class Task11 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        byte numOfSnowball = inputScanner.nextByte();
        long bestSnowballValue = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        for (int i = 0; i < numOfSnowball; i++) {
            int snowballSnow = inputScanner.nextInt();
            int snowballTime = inputScanner.nextInt();
            int snowballQuality = inputScanner.nextInt();
            long snowballValue = (long) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > bestSnowballValue) {
                bestSnowballValue = snowballValue;
                bestSnowballTime = snowballTime;
                bestSnowballSnow = snowballSnow;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)",
                bestSnowballSnow,
                bestSnowballTime,
                bestSnowballValue,
                bestSnowballQuality);
    }
}
