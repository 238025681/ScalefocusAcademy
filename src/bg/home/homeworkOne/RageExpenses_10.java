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
public class RageExpenses_10 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int lostGames = Integer.parseInt(inputScaner.nextLine());
        double headsetPrice = Double.parseDouble(inputScaner.nextLine());
        double mousePrice = Double.parseDouble(inputScaner.nextLine());
        double keyboardPrice = Double.parseDouble(inputScaner.nextLine());
        double displayPrice = Double.parseDouble(inputScaner.nextLine());

        int trashedHeadset = 0;
        int trashedMouse = 0;
        int trashedKeyboard = 0;
        int trashedDisplay = 0;

        for (int game = 1; game <= lostGames; game++) {
            if (game % 2 == 0) {
                trashedHeadset++;
            }
            if (game % 3 == 0) {
                trashedMouse++;
            }
            if ((game % 2 == 0) && (game % 3 == 0)) {
                trashedKeyboard++;
                if (trashedKeyboard % 2 == 0) {
                    trashedDisplay++;
                }
            }
        }

        double result = (headsetPrice * trashedHeadset)
                + (mousePrice * trashedMouse)
                + (keyboardPrice * trashedKeyboard)
                + (displayPrice * trashedDisplay);

        System.out.println(String.format("Rage expenses: %.2f lv.", result));
    }
}
