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
public class Login_05 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String name = inputScaner.nextLine();
        String password = new StringBuilder().append(name).reverse().toString();
        for (int i = 0; i < 4; i++) {
            String currentPass = inputScaner.nextLine();
            if (i == 3 && !password.equals(currentPass)) {
                System.out.println(String.format("User %s blocked!", name));
                return;
            }

            if (!password.equals(currentPass)) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.println(String.format("User %s logged in.", name));
                return;
            }

        }
    }
}
