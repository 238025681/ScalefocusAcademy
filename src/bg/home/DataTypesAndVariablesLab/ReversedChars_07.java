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
public class ReversedChars_07 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(inputScaner.nextLine()).append(" ");
        }
        System.out.println(builder.reverse().toString().trim());
    }
}
