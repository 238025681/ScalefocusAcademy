/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class PrintingTriangle_03 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int triangleLength = Integer.parseInt(inputScanner.nextLine());

        drowTriangle(triangleLength);
    }

    public static void drowTriangle(int triangleLength) {
        int count = 0;
        for (int i = 0; i < triangleLength * 2; i++) {
            if (triangleLength > i) {
                count++;
            } else {
                count--;
            }
            for (int j = 1; j <= count; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println("");
        }
    }

}
