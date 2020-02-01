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
public class Parent {

    private String name;
    private String birthday;

    public Parent(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(name)
                .append(" ")
                .append(birthday).append(System.lineSeparator());
        return sb.toString();
    }
}
