/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P05_BombNumbers {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(inputScaner.nextLine().split(" "))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        int[] bombAndPower = Arrays
                .stream(inputScaner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int currentBombIndex = numbers.indexOf(bombAndPower[0]);
        int powerOfBomb = bombAndPower[1];
        while (currentBombIndex > -1) {

            detonateBomb(numbers, currentBombIndex, powerOfBomb);

            currentBombIndex = numbers.indexOf(bombAndPower[0]);
        }
        System.out.println(numbers.stream().mapToInt(n -> n).sum());
    }

    private static void detonateBomb(List<Integer> numbers, int currentBombIndex, int powerOfBomb) {

        for (int i = 0, j = 0; i <= powerOfBomb; i++, j--) {
            if (currentBombIndex + j >= 0) {
                numbers.set(currentBombIndex + j, 0);
            }
            if (currentBombIndex + i <= numbers.size() - 1) {
                numbers.set(currentBombIndex + i, 0);
            }
        }
    }
}
