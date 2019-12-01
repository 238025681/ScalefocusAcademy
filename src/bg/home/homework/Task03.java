/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homework;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfPersons = inputScaner.nextInt();
        int capacity = inputScaner.nextInt();
        int courses =(int) Math.ceil((double)numberOfPersons / capacity);
        System.out.println(courses);
    }
}
