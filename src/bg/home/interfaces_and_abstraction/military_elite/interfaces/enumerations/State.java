/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.interfaces.enumerations;

/**
 *
 * @author Chobi
 */
public enum State {
    inProgress,
    Finished;

    public static boolean contains(String inputState) {

        for (State state : State.values()) {
            if (state.name().equals(inputState)) {
                return true;
            }
        }

        return false;
    }
}
