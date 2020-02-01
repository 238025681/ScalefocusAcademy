/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.froggy;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Chobi
 */
public class Lake<T> implements Iterable<T> {

    private final int INIT_SIZE = 4;
    private int steps = 0;
    private T[] lake;

    public Lake() {
        this.lake = (T[]) new Object[INIT_SIZE];
    }

    public void add(T element) {
        if (this.steps == this.lake.length) {
            increaseLake();
        }
        this.lake[this.steps++] = element;
    }

    public int size() {
        return this.steps;
    }

    private void increaseLake() {
        this.lake = Arrays.copyOf(this.lake, (this.lake.length * 3) / 2);
    }

    @Override
    public Iterator<T> iterator() {
        return new Forg();
    }

    private final class Forg implements Iterator<T> {

        private int step = 0;

        @Override
        public boolean hasNext() {
            if ((this.step < steps && this.step >= 0) || ((this.step % 2) == 0)) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            T result = lake[this.step];
            this.step += 2;
            if (this.step % 2 == 0 && ((this.step) >= steps)) {
                this.step = 1;
            }
            return result;

        }

    }

}
