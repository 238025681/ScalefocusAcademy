/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.generic_box;

/**
 *
 * @author Chobi
 */
public class Box<T> {

    private T sourse;

    public Box(T sourse) {
        this.sourse = sourse;

    }

    @Override
    public String toString() {
        return new StringBuilder().append(sourse.getClass().getName()).append(": ").append(sourse).toString();
    }

}
