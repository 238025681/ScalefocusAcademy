/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.inheritance.person;
//package person;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        Person child = new Child(name, age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
