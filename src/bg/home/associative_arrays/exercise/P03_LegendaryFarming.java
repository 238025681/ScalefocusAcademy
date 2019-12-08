/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P03_LegendaryFarming {

    public static final int MAX_QUANTITY = 250;
    public static String materialForUse = "";

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Set<LegendaryItems> items = new HashSet();

        items.add(new Shadowmourne());
        items.add(new Valanyr());
        items.add(new Dragonwrath());

        Map<String, Integer> keyMaterials = new TreeMap();
        //Shards, Fragments and Motes 
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junks = new TreeMap();
        boolean isCreated = false;
        while (!isCreated) {
            String[] inputItems = inputScaner.nextLine().split("\\s+");
            for (int i = 0; i < inputItems.length - 1; i += 2) {

                int quantity = Integer.parseInt(inputItems[i]);
                String material = inputItems[i + 1].toLowerCase();

                if (keyMaterials.containsKey(material)) {

                    if (setNewQuantity(quantity, material, keyMaterials) >= MAX_QUANTITY) {
                        isCreated = !isCreated;
                        materialForUse = material;
                        keyMaterials.put(material, keyMaterials.get(material) - MAX_QUANTITY);
                        break;
                    }
                } else {

                    setNewQuantity(quantity, material, junks);
                }

            }
        }

        items
                .stream()
                .filter(i -> i.MATERIAL.equals(materialForUse))
                .forEach(i -> System.out.printf("%s obtained!%n", i.NAME));

        keyMaterials
                .entrySet()
                .stream()
                .sorted((m1, m2) -> {
                    int result = m2.getValue().compareTo(m1.getValue());

                    if (result == 0) {
                        return m1.getKey().compareTo(m2.getKey());
                    }

                    return result;
                })
                .forEach(m -> System.out.println(m.getKey() + ": " + m.getValue()));

        junks
                .entrySet()
                .stream()
                .sorted((m1, m2) -> m1.getKey().compareTo(m2.getKey()))
                .forEach(m -> System.out.println(m.getKey() + ": " + m.getValue()));

    }

    private static int setNewQuantity(int quantity, String material, Map<String, Integer> materials) {

        if (materials.containsKey(material)) {
            materials.put(material, materials.get(material) + quantity);
        } else {
            materials.put(material, quantity);

        }

        return materials.get(material);
    }
//This is abstraction for LEGENDARY ITEM//
    private static abstract class LegendaryItems {

        private final String MATERIAL;
        private final int CAPACITY;
        private final String NAME;

        public LegendaryItems(String material, int capacity, String name) {
            this.MATERIAL = material;
            this.CAPACITY = capacity;
            this.NAME = name;
        }

    }

    private static class Shadowmourne extends LegendaryItems {

        public Shadowmourne() {

            super("shards", 250, "Shadowmourne");
        }

    }

    private static class Valanyr extends LegendaryItems {

        public Valanyr() {

            super("fragments", 250, "Valanyr");
        }

    }

    private static class Dragonwrath extends LegendaryItems {

        public Dragonwrath() {

            super("motes", 250, "Dragonwrath");
        }

    }
}
