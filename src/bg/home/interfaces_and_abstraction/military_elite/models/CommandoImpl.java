/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

import java.util.ArrayList;
import java.util.Collection;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Commando;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps, Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);
    }

    public void setMissions(Collection<Mission> missions) {
        if (missions != null) {
            this.missions = new ArrayList<>(missions);
            return;
        }
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder commandoString = new StringBuilder();

        commandoString
                .append(super.toString())
                .append(System.lineSeparator())
                .append("Missions:")
                .append(System.lineSeparator());

        this.getMissions().forEach((m) -> {
            commandoString.append("  ").append(m).append(System.lineSeparator());
        });

        return commandoString.toString();
    }

}
