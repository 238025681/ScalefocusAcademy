/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homework;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Task09 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        BigInteger startingYeld = new BigInteger(inputScanner.nextLine());
        int minYeld = 100;
        String workerConsumation = "26";
        BigInteger spiceExtracted = BigInteger.ZERO;
        long dayCount = 0;
        BigInteger currentYeld = startingYeld;
        while (minYeld <= currentYeld.intValue()) {
            
            spiceExtracted = spiceExtracted.add(currentYeld.subtract(new BigInteger(workerConsumation)));
            currentYeld = currentYeld.subtract(BigInteger.TEN);
            dayCount++;
            if (minYeld > currentYeld.intValue()) {
                spiceExtracted = spiceExtracted.subtract(new BigInteger(workerConsumation));
            }
        }
        System.out.println(dayCount);
        System.out.println(spiceExtracted.toString());

    }
}
