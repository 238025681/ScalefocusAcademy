/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P03_HouseParty {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(inputScaner.nextLine());
        List<String> guestsList = new ArrayList();

        for (int i = 0; i < numberOfLines; i++) {
            String guest = inputScaner.nextLine();
            String name = Arrays.stream(guest.split(" ")).findFirst().get();
            if (!guest.contains("not")) {
                if (!guestsList.contains(name)) {
                    guestsList.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        guestsList.forEach(guest -> System.out.println(guest));
    }
}
