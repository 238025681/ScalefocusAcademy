/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.text_processing.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P01_ValidUsernames {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String regex = "^[a-zA-Z0-9_-]{3,16}$";
        String[] usernames = inputScaner.nextLine().split(", ");
        
        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username);
            }
        }
    }
}
