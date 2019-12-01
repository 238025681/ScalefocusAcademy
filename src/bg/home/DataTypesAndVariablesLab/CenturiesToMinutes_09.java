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
public class CenturiesToMinutes_09 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int centuries = Integer.parseInt(inputScaner.nextLine());
        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println(String.format("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries, years, days, hours, minutes));
    }
}
