/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P06_ListOfProducts {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int lineNumbers = Integer.parseInt(inputScaner.nextLine());
        List<String> products = new ArrayList();
        for (int i = 0; i < lineNumbers; i++) {
            String currentProduct = inputScaner.nextLine();
            products.add(currentProduct);
        }
        products.sort((String p1, String p2) -> {
            return p1.compareTo(p2);
        });
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "." + products.get(i));
        }
    }
}
