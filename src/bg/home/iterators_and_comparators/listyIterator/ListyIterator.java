/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.listyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author Chobi
 */
public class ListyIterator<T> implements Iterator<T> {

    private List<T> items;
    private int internalindex;

    public ListyIterator(T... items) {
        this.setItems(items);
        this.internalindex = 0;
    }

    public void setItems(T... items) {
        if (items.length == 0) {
            this.items = new ArrayList<>();
        } else {
            this.items = new ArrayList<>(Arrays.asList(items));
        }
    }

    public boolean move() {
        if (this.internalindex >= this.items.size() - 1) {
            return false;
        }
        this.internalindex++;
        return true;
    }

    public boolean hasNext() {

        return this.internalindex < (this.items.size() - 1);
    }

    public void print() {
        if (this.items.size() == 0) {
            System.out.println("Invalid Operation!");
        } else {

            System.out.println(this.items.get(this.internalindex));
        }

    }

    public void printAll() {
        try {
            StringBuilder result = new StringBuilder();
            for (T item : this.items) {
                result.append(item).append(" ");
            }
            result.trimToSize();
            System.out.println(result.toString());
        } catch (Exception e) {
            System.out.println("Invalid Operation!");
        }
    }

    @Override
    public T next() {
        return this.items.get(this.internalindex++);
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }

}
