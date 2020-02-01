/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.listyIterator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static ListyIterator listyIterator;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String input = "";
        while (!"end".equalsIgnoreCase(input = inputScaner.nextLine())) {

            executeCommand(input);
        }
    }

    private static void executeCommand(String input) {

        String[] tokens = input.split("\\s+");

        switch (tokens[0]) {
            case "Create":
                if (tokens.length > 1) {
                    listyIterator = new ListyIterator(Arrays.copyOfRange(tokens, 1, tokens.length));
                } else {
                    listyIterator = new ListyIterator();
                }
                break;
            case "Move":
                System.out.println(listyIterator.move());
                break;
            case "Print":
                listyIterator.print();
                break;
            case "PrintAll":
                listyIterator.printAll();
                break;
            case "HasNext":
                System.out.println(listyIterator.hasNext());
                break;
            default:
                break;
        }
    }
}
