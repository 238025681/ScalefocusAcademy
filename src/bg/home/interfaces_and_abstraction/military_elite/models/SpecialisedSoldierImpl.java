/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  bg.home.interfaces_and_abstraction.military_elite.models;

import bg.home.interfaces_and_abstraction.military_elite.interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(System.lineSeparator())
                .append("Corps: ")
                .append(this.getCorps()).toString();
    }

}
