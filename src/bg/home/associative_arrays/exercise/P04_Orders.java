/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P04_Orders {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        Map<String, Double> productsList = new LinkedHashMap();
        Map<String, Integer> productsListQuantity = new LinkedHashMap();

        String input = "";
        while (!"buy".equals(input = inputScaner.nextLine())) {
            String[] currentProduct = input.split(" ");
            String productName = currentProduct[0];
            double productPrice = Double.parseDouble(currentProduct[1]);
            int productQuantity = Integer.parseInt(currentProduct[2]);

            if (productsList.containsKey(productName)) {

                if (!productsList.get(productName).equals(productPrice)) {
                    productsList.put(productName, productPrice);
                }

                productsListQuantity.put(productName, productQuantity + productsListQuantity.get(productName));

            } else {
                productsList.put(productName, productPrice);
                productsListQuantity.put(productName, productQuantity);
            }
        }
        for (var entry : productsList.entrySet()) {

            double totalPrice = entry.getValue() * productsListQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }

}
