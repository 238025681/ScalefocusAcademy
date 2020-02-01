/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.threeuple;


/**
 *
 * @author Chobi
 */
public class Threeuple<K, V, V2> {

    private K item1;
    private V item2;
    private V2 item3;

    public Threeuple() {
    }

    public K getItem1() {
        return item1;
    }

    public void setItem1(K item1) {
        this.item1 = item1;
    }

    public V getItem2() {
        return item2;
    }

    public void setItem2(V item2) {
        this.item2 = item2;
    }

    public V2 getItem3() {
        return item3;
    }

    public void setItem3(V2 item3) {
        this.item3 = item3;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(item1);
        sb.append(" -> ").append(item2);
        sb.append(" -> ").append(item3);
        return sb.toString();
    }

}
