/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.interfaces;

import java.util.Collection;
import bg.home.interfaces_and_abstraction.military_elite.models.Mission;

/**
 *
 * @author Chobi
 */
public interface Commando extends SpecialisedSoldier {

    public void addMission(Mission mission);

    public Collection<Mission> getMissions();
}
