/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.custom_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Chobi
 */
public class CustomList<T extends Comparable<T>> implements IList<T>, Iterable<T> {

    private List<T> elementsList;

    public CustomList() {
        this.elementsList = new ArrayList();
    }

    @Override
    public void add(T element) {
        this.elementsList.add(element);
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < this.elementsList.size()) {
            this.elementsList.remove(index);
        }
    }

    @Override
    public boolean contains(T element) {
        return this.elementsList.contains(element);
    }

    @Override
    public void swap(int index, int index2) {
        if ((index >= 0 && index < this.elementsList.size())
                && (index2 >= 0 && index2 < this.elementsList.size())) {

            T first = this.elementsList.get(index);
            this.elementsList.set(index, this.elementsList.get(index2));
            this.elementsList.set(index2, first);
        }
    }

    @Override
    public int countGreaterThan(T element) {
        int count = 0;
        for (T t : elementsList) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        return Collections.max(elementsList);
    }

    @Override
    public T getMin() {
        return Collections.min(elementsList);
    }

    public List<T> getElementsList() {
        return elementsList;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

}
