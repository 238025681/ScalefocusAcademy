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
public class LowerOrUpper_08 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String character = inputScaner.nextLine();
        System.out.println(String.format("%s", character.equals(character.toLowerCase()) ? "lower-case": "upper-case"));
    }
}
