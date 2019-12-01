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
public class Task01 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        int firstArg = inputScan.nextInt();
        int secondArg = inputScan.nextInt();
        int divideBy = inputScan.nextInt();
        int multiplyBy = inputScan.nextInt();
        System.out.println(((firstArg+secondArg)/divideBy)*multiplyBy);
    }
   
}
