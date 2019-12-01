/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class CalculateRectangleArea_06 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double width = Double.parseDouble(inputScanner.nextLine());
        double height = Double.parseDouble(inputScanner.nextLine());
        double area = getRectangleArea(width, height);
        System.out.println(new DecimalFormat("0.####").format(area));
    }

    private static double getRectangleArea(double width, double height) {
        return width * height;
    }
}
