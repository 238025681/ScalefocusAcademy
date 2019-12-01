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
public class P08_AnonymousThreat {

    public static void main(String[] args) throws Exception {
        Scanner inputScaner = new Scanner(System.in);
        List<String> data = Arrays.stream(inputScaner.nextLine().split(" "))
                .collect(Collectors.toList());
        String input = inputScaner.nextLine();
        while (!input.equals("3:1")) {
            String[] token = input.split(" ");
            String command = token[0];
            int indexOne = Integer.parseInt(token[1]);
            int indexTwo = Integer.parseInt(token[2]);
            if (token[0].equals("merge")) {

                data = mergeData(data, indexOne, indexTwo);

            } else if (token[0].equals("divide")) {
                data = divideData(data, indexOne, indexTwo);
            }

            input = inputScaner.nextLine();
        }

        System.out.println(data.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<String> mergeData(List<String> data, int startindex, int endIndex) {

        int start = (startindex >= 0) && (startindex < data.size()) ? startindex : 0;
        int end = (endIndex < data.size()) && (endIndex >= 0) ? endIndex : data.size() - 1;

        StringBuilder merge = new StringBuilder();

        for (int i = start; i <= end; i++) {
                merge.append(data.get(i));
                data.set(i, "");
        }
        data.add(start, merge.toString());

        return data.stream().filter(s -> !s.equals("")).collect(Collectors.toList());
    }

    private static List<String> divideData(List<String> data, int index, int partitions) throws Exception {
        String stringToDivide = data.get(index);
        if (stringToDivide.length() >= partitions && partitions > 0) {

            int subStrings = stringToDivide.length() / partitions;
            data.remove(index);
            int remainder = (stringToDivide.length() % partitions) != 0 ? (stringToDivide.length() % partitions) : 0;
            for (int i = 0; i < stringToDivide.length() - remainder; i += subStrings) {
                data.add(index++, stringToDivide.substring(i, i + subStrings));
            }
            if (remainder != 0) {
                data.set(--index, data.get(index) + stringToDivide.substring(stringToDivide.length() - remainder, stringToDivide.length()));
            }
        }
        return data;
    }
}
