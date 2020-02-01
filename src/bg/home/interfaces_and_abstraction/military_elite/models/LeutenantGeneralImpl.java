/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import bg.home.interfaces_and_abstraction.military_elite.models.comparators.PrivatesComparator;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.LeutenantGeneral;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Private;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {

    private Set<Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet(new PrivatesComparator());
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }

    @Override
    public Set<Private> getPrivate() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder privatesResult = new StringBuilder();

        privatesResult
                .append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator());

        this.getPrivate()
                .forEach(p -> privatesResult.append("  ").append(p).append(System.lineSeparator()));

        return privatesResult.toString();
    }

}
