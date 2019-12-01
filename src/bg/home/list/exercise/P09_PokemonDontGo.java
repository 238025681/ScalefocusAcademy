/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P09_PokemonDontGo {

    public static void main(String[] args) throws Exception {
        Scanner inputScaner = new Scanner(System.in);
        List<Integer> pokemons = Arrays
                .stream(inputScaner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        Long totalPokemonPower = 0L;

        while (pokemons.size() > 0) {
            int currentPokemonIndex = Integer.parseInt(inputScaner.nextLine());
            
            if (currentPokemonIndex < 0) {
                int firstPokemon = pokemons.get(0);
                int lastPokemon = pokemons.get(pokemons.size() - 1);
                pokemons.set(0, lastPokemon);
                pokemons = countNewPokemonsPower(pokemons, firstPokemon);
                totalPokemonPower += firstPokemon;
                continue;
            }

            if (currentPokemonIndex > pokemons.size() - 1) {
                int firstPokemon = pokemons.get(0);
                int lastPokemon = pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1, firstPokemon);
                pokemons = countNewPokemonsPower(pokemons, lastPokemon);
                totalPokemonPower += lastPokemon;
                continue;
            }

            int currentPokemon = pokemons.get(currentPokemonIndex);
            pokemons.remove(currentPokemonIndex);
            totalPokemonPower += currentPokemon;
            pokemons = countNewPokemonsPower(pokemons, currentPokemon);
        }
        System.out.println(totalPokemonPower);

    }

    private static List<Integer> countNewPokemonsPower(List pokemons, Integer pokemonPower) {

        ToIntFunction<Integer> calculatePokemonsPower = s -> {
            int pokemonCompare = Integer.compare(s, pokemonPower);
            int apsoluteValueOfPokemonPower = Math.abs(pokemonPower);

            if (pokemonCompare > 0) {
                return s - apsoluteValueOfPokemonPower;
            }
            return s + apsoluteValueOfPokemonPower;
        };

        return pokemons
                .stream()
                .mapToInt(calculatePokemonsPower)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
