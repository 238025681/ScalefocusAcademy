/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.stack_iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Chobi
 */
public class StackIterator<T> implements Iterable<T> {

    private final int INIT_SIZE = 10;
    private int current_index = 0;
    private T[] elements;

    public StackIterator() {
        this.elements = (T[]) new Object[INIT_SIZE];
    }

    public void push(T elements) {
        if (this.current_index == this.elements.length) {
            expadStack();
        }
        this.elements[this.current_index++] = elements;
    }

    public T pop() {
        T elementToPop;
        if (this.current_index == 0) {

            return null;
        } else {
            elementToPop = this.elements[--this.current_index];
            this.elements[this.current_index] = null;
            return elementToPop;
        }
    }

    public int size() {
        return this.current_index;
    }

    private void expadStack() {
        int increasedStackSize = (this.elements.length * 3) / 2;
        this.elements = Arrays.copyOf(this.elements, increasedStackSize);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private final class CustomIterator implements Iterator<T> {

        private int counter = current_index - 1;

        public CustomIterator() {
        }

        @Override
        public boolean hasNext() {
            if (this.counter < elements.length && this.counter >= 0) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            return elements[counter--];
        }
    }

}
