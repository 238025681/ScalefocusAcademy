/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static Map<String, Person> persons = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";
        while (!(input = inputScaner.nextLine()).equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");
            Person person;
            if (persons.containsKey(tokens[0])) {
                person = persons.get(tokens[0]);
            } else {
                person = new Person();
                person.setName(tokens[0]);
            }
            person = updatePersonInfo(tokens, person);
            persons.put(person.getName(), person);
        }
        input = inputScaner.nextLine();
        System.out.println(persons.get(input));
    }

    private static Person updatePersonInfo(String[] tokens, Person person) {

        String property = tokens[1];
        Person currentPerson = person;

        switch (property) {
            case "company":
                person.setCompany(new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4])));
                break;
            case "car":
                person.setCar(new Car(tokens[2], Integer.parseInt(tokens[3])));
                break;
            case "pokemon":
                person.addPokemons(new Pokemon(tokens[2], tokens[3]));
                break;
            case "parents":
                person.addParents(new Parent(tokens[2], tokens[3]));
                break;
            case "children":
                person.addChildrens(new Children(tokens[2], tokens[3]));
                break;
            default:
                break;

        }

        return currentPerson;
    }
}
