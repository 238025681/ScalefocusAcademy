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
public class ComparatorByLenght implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length() > o2.getName().length()) {
            return 1;
        }
        if (o1.getName().length() == o2.getName().length()) {
            return o1.getName().subSequence(0, 1).toString().compareToIgnoreCase(o2.getName().subSequence(0, 1).toString());
        }
        return -1;
    }

}
