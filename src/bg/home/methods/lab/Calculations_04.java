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
public class Calculations_04 {

    //"add", "multiply", "subtract", "divide"
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String calculationCommand = inputScanner.nextLine().toLowerCase();
        int firstArgument = Integer.parseInt(inputScanner.nextLine());
        int secondArgument = Integer.parseInt(inputScanner.nextLine());

        calculate(calculationCommand, firstArgument, secondArgument);

    }

    private static void calculate(String calculationCommand, int firstArgument, int secondArgument) {

        switch (calculationCommand) {
            case "add":
                add(firstArgument, secondArgument);
                break;
            case "multiply":
                multiply(firstArgument, secondArgument);
                break;
            case "subtract":
                subtract(firstArgument, secondArgument);
                break;
            case "divide":
                divide(firstArgument, secondArgument);
                break;
            default:
                break;
        }
    }

    private static void add(int firstArgument, int secondArgument) {
        System.out.println(firstArgument + secondArgument);
    }

    private static void multiply(int firstArgument, int secondArgument) {
        System.out.println(firstArgument * secondArgument);
    }

    private static void subtract(int firstArgument, int secondArgument) {
        System.out.println(firstArgument - secondArgument);
    }

    private static void divide(int firstArgument, int secondArgument) {
        System.out.println(firstArgument / secondArgument);
    }
}
