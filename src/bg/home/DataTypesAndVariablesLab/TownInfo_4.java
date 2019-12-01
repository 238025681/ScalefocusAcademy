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
public class TownInfo_4 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String townName = inputScaner.nextLine();
        long population = Long.parseLong(inputScaner.nextLine());
        long area = Long.parseLong(inputScaner.nextLine());

        System.out.println(String.format("Town %s has population of %d and area %d square km.", townName, population, area));
    }
}
