/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.generic_swap_method_strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chobi
 */
public class Box<T> {

    private List<T> sourse;

    public Box() {
        this.sourse = new ArrayList<>();
    }

    public void setSourse(T sourse) {
        this.sourse.add(sourse);
    }

    public void swapElement(int startIndex, int endIndex) {
        T first = this.sourse.get(startIndex);
        this.sourse.set(startIndex, this.sourse.get(endIndex));
        this.sourse.set(endIndex, first);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T t : sourse) {
            result.append(t.getClass().getName())
                    .append(": ")
                    .append(t)
                    .append(System.lineSeparator());
        }
        return result.toString();
    }

}
