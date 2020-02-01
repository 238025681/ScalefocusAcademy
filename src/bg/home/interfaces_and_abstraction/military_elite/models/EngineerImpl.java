/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

import java.util.ArrayList;
import java.util.Collection;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Engineer;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Collection<Repair> repair;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, Collection<Repair> repair) {
        super(id, firstName, lastName, salary, corps);
        this.setRepair(repair);
    }

    public void setRepair(Collection<Repair> repair) {
        if (repair != null) {
            this.repair = new ArrayList<>(repair);
            return;
        }
        this.repair = new ArrayList<>();
    }

    public void addRepair(Repair repair) {
        this.repair.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repair;
    }

    @Override
    public String toString() {

        StringBuilder engineerString = new StringBuilder();

        engineerString
                .append(super.toString())
                .append(System.lineSeparator())
                .append("Repairs:")
                .append(System.lineSeparator());

        this.getRepairs().forEach(r -> engineerString.append("  ").append(r).append(System.lineSeparator()));

        return engineerString.toString();
    }

}
