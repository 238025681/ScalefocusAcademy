/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOne;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class PadawanEquipment_09 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(inputScaner.nextLine());
        int studentsCount = Integer.parseInt(inputScaner.nextLine());
        double sabresPrice = Double.parseDouble(inputScaner.nextLine());
        double robesPrice = Double.parseDouble(inputScaner.nextLine());
        double beltsPrice = Double.parseDouble(inputScaner.nextLine());
        int freeBelts = studentsCount > 5 ? studentsCount / 6 : 0;
        double bill = (sabresPrice * (Math.ceil(studentsCount * 1.1))) + (robesPrice * studentsCount) + (beltsPrice * (studentsCount - freeBelts));

        if (bill <= amountOfMoney) {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", bill));
        } else {
            System.out.println(String.format("Ivan Cho will need %.2flv more.", bill - amountOfMoney));
        }
    }
}
