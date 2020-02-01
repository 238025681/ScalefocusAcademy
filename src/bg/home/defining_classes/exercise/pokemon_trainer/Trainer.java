/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.pokemon_trainer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chobi
 */
public class Trainer {

    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name, int badges) {
        this.name = name;
        this.badges = badges;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addBadges(int badges) {
        this.badges += badges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        this.pokemons.remove(pokemon);
    }

    public boolean containsElement(String element) {
        return this.pokemons.stream().anyMatch(pok -> pok.getElement().equalsIgnoreCase(element));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer{name=").append(name);
        sb.append(", badges=").append(badges);
        sb.append(", pokemons=").append(pokemons);
        sb.append('}');
        return sb.toString();
    }

}
