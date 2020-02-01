/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.multidimensional_arrays;

/**
 *
 * @author Chobi
 */
public class Printer {

    public static <T> void print(T[][] result) {

        for (T[] elements : result) {
            for (T element : elements) {

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
