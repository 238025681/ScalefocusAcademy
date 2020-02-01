/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.defining_classes.exercise.google;

/**
 *
 * @author Chobi
 */
public class Pokemon {

    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(name)
                .append(" ")
                .append(type).append(System.lineSeparator());
        return sb.toString();
    }
}
