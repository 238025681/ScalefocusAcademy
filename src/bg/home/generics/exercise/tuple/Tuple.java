/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.tuple;

/**
 *
 * @author Chobi
 */
public class Tuple<K, V> {

    private K item1;
    private V item2;

    public Tuple(K item1, V item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(item1);
        sb.append(" -> ").append(item2);
        return sb.toString();
    }

}
