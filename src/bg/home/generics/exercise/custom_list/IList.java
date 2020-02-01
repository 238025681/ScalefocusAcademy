/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.custom_list;

import java.util.List;

/**
 *
 * @author Chobi
 * @param <T>
 */
public interface IList<T> {

    void add(T element);

    void remove(int index);

    boolean contains(T element);

    public List<T> getElementsList();

    void swap(int index, int index2);

    int countGreaterThan(T element);

    T getMax();

    T getMin();
}
