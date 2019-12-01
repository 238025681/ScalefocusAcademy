/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Set<String> firstSentence = Arrays.stream(inputScaner.nextLine().split(" ")).collect(Collectors.toSet());
        Set<String> secondSentence = Arrays.stream(inputScaner.nextLine().split(" ")).collect(Collectors.toSet());
        
        Set<String> intersection = new LinkedHashSet<>(secondSentence);
        intersection.retainAll(firstSentence);
        intersection.forEach(s ->{
            System.out.print(s+" ");
        });
        System.out.println("");
        
        
    }
}
