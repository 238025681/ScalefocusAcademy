/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P01_AdvertisementMessage {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        List<String> phrases = Arrays
                .asList(
                        new String[]{"Excellent product.",
                            "Such a great product.",
                            "I always use that product.",
                            "Best product of its category.",
                            "Exceptional product.",
                            "I can’t live without this product."});

        List<String> events = Arrays
                .asList(
                        new String[]{"Now I feel good.",
                            "I have succeeded with this product.",
                            "Makes miracles. I am happy of the results!",
                            "I cannot believe but now I feel awesome.",
                            "Try it yourself, I am very satisfied.",
                            "I feel great!"});

        List<String> authors = Arrays
                .asList(
                        new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"});

        List<String> cities = Arrays
                .asList(
                        new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"});

        int numberOfMessages = Integer.parseInt(inputScaner.nextLine());

        Random rnd = new Random();
        for (int i = 0; i < numberOfMessages; i++) {
            StringBuilder advertisementMessage = new StringBuilder();
            advertisementMessage.append(phrases.get(rnd.nextInt(phrases.size()))).append(" ");
            advertisementMessage.append(events.get(rnd.nextInt(events.size()))).append(" ");
            advertisementMessage.append(authors.get(rnd.nextInt(authors.size()))).append(" ");
            advertisementMessage.append("- ");
            advertisementMessage.append(cities.get(rnd.nextInt(cities.size())));
            System.out.println(advertisementMessage.toString());
        }

    }
}
