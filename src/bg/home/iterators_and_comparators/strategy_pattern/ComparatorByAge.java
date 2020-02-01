/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.strategy_pattern;

import java.util.Comparator;

/**
 *
 * @author Chobi
 */
public class ComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
