/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.pokemon_trainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static Map<String, Trainer> trainers = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";
        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("tournament")) {

            String[] tokens = input.split("\\s+");
            Trainer trainer;
            if (!trainers.containsKey(tokens[0])) {

                trainer = new Trainer(tokens[0], 0);
                Pokemon pokemon = new Pokemon(tokens[1], tokens[2], Integer.parseInt(tokens[3]));
                trainer.addPokemon(pokemon);
                trainers.put(tokens[0], trainer);
            } else {
                Pokemon pokemon = new Pokemon(tokens[1], tokens[2], Integer.parseInt(tokens[3]));
                trainer = trainers.get(tokens[0]);
                trainer.addPokemon(pokemon);
                trainers.replace(tokens[0], trainer);
            }

        }

        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            playGame(input);
        }

        trainers
                .entrySet()
                .stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getBadges(), t1.getValue().getBadges()))
                .forEach(tr -> {

                    String name = tr.getKey();
                    int badges = tr.getValue().getBadges();
                    int numberOfPokemons = tr.getValue().getPokemons().size();
                    System.out.println(new StringBuilder().append(name).append(" ").append(badges).append(" ").append(numberOfPokemons).toString());
                });

    }

    private static void playGame(String element) {
        for (Trainer trainer : trainers.values()) {
            if (trainer.containsElement(element)) {
                trainer.addBadges(1);
            } else {
                List<Pokemon> deletedPokemons = new ArrayList<>();
                for (Pokemon pokemon : trainer.getPokemons()) {
                    if (pokemon.getHealth() <= 10) {
                        deletedPokemons.add(pokemon);
                    } else {
                        pokemon.setHealth(10);
                    }
                }
                trainer.getPokemons().removeAll(deletedPokemons);
            }
        }
    }

}
