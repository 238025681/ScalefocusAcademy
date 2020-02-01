/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.custom_list;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static CommandController controller = new CommandController(new CustomList<String>());

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String input = "";
        while (!"end".equalsIgnoreCase(input = inputScaner.nextLine())) {
            executeCommand(input);
        }
    }

    private static void executeCommand(String input) {
        String[] tokens = input.split("\\s+");
        String command = tokens[0];

        switch (command) {
            case "Add":
                controller.add(tokens[1]);
                break;
            case "Remove":
                controller.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(controller.contains(tokens[1]));
                break;
            case "Swap":
                controller.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                break;
            case "Greater":
                System.out.println(controller.greater(tokens[1]));
                break;
            case "Max":
                System.out.println(controller.max());

                break;
            case "Min":
                System.out.println(controller.min());
                break;
            case "Print":
                controller.print();
                break;
            case "Sort":
                Sorter.sort(controller.getCustomList());
                break;
            default:
                break;
        }
    }
}
