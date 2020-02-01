/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models.comparators;

import java.util.Comparator;
import bg.home.interfaces_and_abstraction.military_elite.models.PrivateImpl;

/**
 *
 * @author Chobi
 */
public class PrivatesComparator implements Comparator<PrivateImpl> {

    @Override
    public int compare(PrivateImpl o1, PrivateImpl o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }

}
