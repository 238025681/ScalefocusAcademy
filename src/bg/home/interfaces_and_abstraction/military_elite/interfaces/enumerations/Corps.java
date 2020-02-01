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
public enum Corps {
    Airforces,
    Marines;

    public static boolean contains(String inputCorps) {

        for (Corps corps : Corps.values()) {
            if (corps.name().equals(inputCorps)) {
                return true;
            }
        }

        return false;
    }
}
