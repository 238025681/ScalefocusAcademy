/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class KaminoFactory_09 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(inputScaner.nextLine());
        char[] result = new char[dnaLength];
        int bestSequenceSum = 0;
        int bestSequenceIndex = 0;
        int bestArrSeq = 0;
        int arrIndex = -1;
        int currentIndex = 0;
        int counter = 0;
        String currentDna = "";

        while (!"Clone them!".equals(currentDna = inputScaner.nextLine())) {
            currentIndex++;
            String dna = currentDna.replace("!", "");
            char[] dnaArr = currentDna.replace("!", "").toCharArray();
            if (getDnaSum(dna) == 0) {
                if (currentIndex == 1) {
                    result = dnaArr;
                }
                continue;
            }
            int[] bestSequence = getBestSequence(dnaArr);
            if (bestSequence[0] > bestArrSeq) {

                bestArrSeq = bestSequence[0];
                arrIndex = bestSequence[1];
                bestSequenceIndex = currentIndex;
                bestSequenceSum = getDnaSum(dna);
                result = dnaArr;

            } else if (bestSequence[0] == bestArrSeq && arrIndex > bestSequence[1]) {
                bestArrSeq = bestSequence[0];
                arrIndex = bestSequence[1];
                bestSequenceIndex = currentIndex;
                bestSequenceSum = getDnaSum(dna);
                result = dnaArr;
            } else if (bestSequence[0] == bestArrSeq
                    && arrIndex == bestSequence[1]
                    && bestSequenceSum < getDnaSum(dna)) {

                bestArrSeq = bestSequence[0];
                arrIndex = bestSequence[1];
                bestSequenceIndex = currentIndex;
                bestSequenceSum = getDnaSum(dna);
                result = dnaArr;
            }

        }

        if (arrIndex != -1) {
            System.out.println(String.format("Best DNA sample %d with sum: %d.", bestSequenceIndex, bestSequenceSum));
            System.out.println(String.format("%s", Arrays.toString(result)).replaceAll("[\\[,\\]]", ""));
        } else {
            System.out.println(String.format("Best DNA sample %d with sum: %d.", 1, bestSequenceSum));
            System.out.println(String.format("%s", Arrays.toString(result)).replaceAll("[\\[,\\]]", ""));
        }
    }

    public static int[] getBestSequence(char[] dnaArr) {
        int startIndex = -1;
        int tempIndex = -1;
        int bestArrSeq = 0;
        int counter = 0;
        int[] result = new int[2];
        for (int i = 0; i < dnaArr.length; i++) {
            if (dnaArr[i] != '1') {
                continue;
            }
            if (i == dnaArr.length - 1 && bestArrSeq == 0) {
                bestArrSeq = 1;
                startIndex = i;
                break;
            }

            for (int j = i + 1; j < dnaArr.length; j++) {
                if (tempIndex != i) {
                    tempIndex = i;
                }
                counter++;
                if (dnaArr[j] != '1') {
                    if (counter > bestArrSeq) {
                        bestArrSeq = counter;
                        startIndex = tempIndex;
                    }
                    i++;
                    counter = 0;
                    break;
                }
                if (j == dnaArr.length - 1) {
                    if (counter > bestArrSeq) {
                        bestArrSeq = counter;
                        startIndex = tempIndex;
                    }
                }
            }
        }
        result[0] = bestArrSeq;
        result[1] = startIndex;
        return result;
    }

    public static int getDnaSum(String dna) {
        int bestSequenceSum;
        bestSequenceSum = dna.chars()
                .filter(s -> s != '0')
                .map(s -> s - '0')
                .reduce(0, Integer::sum);
        return bestSequenceSum;
    }
}
