/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

import  bg.home.interfaces_and_abstraction.military_elite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {

        /*
        "Name: <firstName> <lastName> Id: <id>
Code Number: <codeNumber>"
        
         */
        return new StringBuilder()
                .append("Name: ")
                .append(this.getFirstName())
                .append(" ")
                .append(this.getLastName())
                .append(" Id: ")
                .append(this.getId())
                .append(System.lineSeparator())
                .append("Code Number: ")
                .append(this.getCodeNumber())
                .toString();
    }

}
