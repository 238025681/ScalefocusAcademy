/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class MathPower_08 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double number = Double.parseDouble(inputScanner.nextLine());
        double power = Double.parseDouble(inputScanner.nextLine());

        System.out.println(
                new DecimalFormat("0.####")
                        .format(calculatesMathPower(number, power)));

    }

    private static double calculatesMathPower(double number, double power) {
        return Math.pow(number, power);
    }
}
