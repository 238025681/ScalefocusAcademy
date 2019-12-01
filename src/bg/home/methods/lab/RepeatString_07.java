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
public class RepeatString_07 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String word = inputScanner.nextLine();
        int numberOfrepeat = Integer.parseInt(inputScanner.nextLine());

        String repeatedString = createRepeatString(word, numberOfrepeat);
        System.out.println(repeatedString);

    }

    private static String createRepeatString(String word, int numberOfrepeat) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < numberOfrepeat; i++) {
            temp.append(word);
        }
        return temp.toString();
    }
}
