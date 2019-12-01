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
public class Grades_02 {

    public static final String[] GRADES = new String[]{"Fail", "Poor", "Good", "Very good", "Excellent"};

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double inputGrade = Double.parseDouble(inputScanner.nextLine());

        getGrades(inputGrade);

        /*
            ●	2.00 – 2.99 - "Fail"
            ●	3.00 – 3.49 - "Poor"
            ●	3.50 – 4.49 - "Good"
            ●	4.50 – 5.49 - "Very good"
            ●	5.50 – 6.00 - "Excellent"
         */
    }

    private static void getGrades(double inputGrade) {

        if (inputGrade >= 5.50) {
            System.out.println(GRADES[4]);
        }
        if (inputGrade >= 4.50 && inputGrade <= 5.49) {
            System.out.println(GRADES[3]);

        }
        if (inputGrade >= 3.50 && inputGrade <= 4.49) {
            System.out.println(GRADES[2]);

        }
        if (inputGrade >= 3.00 && inputGrade <= 3.49) {
            System.out.println(GRADES[1]);

        }
        if (inputGrade >= 2.00 && inputGrade <= 2.99) {
            System.out.println(GRADES[0]);

        }

    }
}
