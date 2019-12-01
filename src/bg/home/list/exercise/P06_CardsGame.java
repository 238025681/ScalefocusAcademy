/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P06_CardsGame {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        ArrayDeque<Integer> firstPlayerHand = Arrays
                .stream(inputScaner.nextLine().split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondPlayerHand = Arrays
                .stream(inputScaner.nextLine().split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toCollection(ArrayDeque::new));

        while ((firstPlayerHand.size() > 0) && (secondPlayerHand.size() > 0)) {

            int firstPlayerCurrentCard = firstPlayerHand.poll();
            int secondPlayerCurrentCard = secondPlayerHand.poll();
            int resultOfCompare = Integer.compare(firstPlayerCurrentCard, secondPlayerCurrentCard);

            if (resultOfCompare > 0) {
                firstPlayerHand.offer(firstPlayerCurrentCard);
                firstPlayerHand.offer(secondPlayerCurrentCard);
            } else if (resultOfCompare < 0) {
                secondPlayerHand.offer(secondPlayerCurrentCard);
                secondPlayerHand.offer(firstPlayerCurrentCard);
            }
        }
        String winner = firstPlayerHand.size() > secondPlayerHand.size() ? "First" : "Second";
        if (winner.equals("First")) {

            System.out.printf("%s player wins! Sum: %d%n", winner, firstPlayerHand.stream().mapToInt(n -> n).sum());
        } else {
            System.out.printf("%s player wins! Sum: %d%n", winner, secondPlayerHand.stream().mapToInt(n -> n).sum());
        }
    }

}
