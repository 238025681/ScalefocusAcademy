/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P00_InClassExercise {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int[] temp = new int[]{1, 0, 1, 0, 1, 0, 0, 1, 0, 0};

        List<Integer> arrayOfOnes = new ArrayList();
        List<Integer> arrayOfZeroes = new ArrayList();
        for (int i = 0; i < temp.length; i++) {

            if (temp[i] == 1) {
                arrayOfOnes.add(temp[i]);
            } else {

                arrayOfZeroes.add(temp[i]);
            }
        }

        System.out.println(arrayOfOnes);
        System.out.println(arrayOfZeroes);

    }
}
