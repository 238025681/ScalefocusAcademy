/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

import bg.home.interfaces_and_abstraction.military_elite.interfaces.enumerations.State;

/**
 *
 * @author Chobi
 */
public class Mission {

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getCodeName() {
        return codeName;
    }

    public String getState() {
        return state;
    }

    public void completeMission() {
        this.state = State.Finished.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Code Name: ").append(this.codeName).append(" State: ").append(this.state);
        return sb.toString();
    }

}
