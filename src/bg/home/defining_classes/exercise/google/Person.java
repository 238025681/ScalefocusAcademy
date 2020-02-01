/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chobi
 */
public class Person {

    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Children> childrens;
    private List<Pokemon> pokemons;

    public Person() {
        this.parents = new ArrayList<>();
        this.childrens = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addParents(Parent parent) {
        this.parents.add(parent);
    }

    public void addChildrens(Children children) {
        this.childrens.add(children);
    }

    public void addPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (company != null) {
            sb.append(company);
        }
        sb.append("Car:").append(System.lineSeparator());
        if (car != null) {
            sb.append(car);
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        if (pokemons.size() > 0) {
            for (Pokemon pokemon : pokemons) {
                sb.append(pokemon);
            }
        }
        sb.append("Parents:").append(System.lineSeparator());
        if (parents.size() > 0) {
            for (Parent parent : parents) {
                sb.append(parent);
            }
        }

        sb.append("Children:").append(System.lineSeparator());
        if (childrens.size() > 0) {
            for (Children children : childrens) {
                sb.append(children);
            }
        }
        return sb.toString();
    }

}
