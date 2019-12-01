/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.DataTypesAndVariablesLab;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class ConvertMetersToKilometers_01 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        double meters = Double.parseDouble(inputScaner.nextLine());
        System.out.println(String.format("%.2f", meters / 1000));
    }

}
