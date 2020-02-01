/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.count_method_strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chobi
 */
public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private T sourse;

    public Box(T sourse) {
        this.sourse = sourse;
    }

    public T getSourse() {
        return sourse;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(sourse.getClass().getName())
                .append(": ")
                .append(sourse).toString();
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.sourse.compareTo(o.getSourse());
    }

}
