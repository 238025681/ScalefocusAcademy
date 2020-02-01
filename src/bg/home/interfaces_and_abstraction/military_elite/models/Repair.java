/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;

/**
 *
 * @author Chobi
 */
public class Repair {

    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Part Name: ")
                .append(this.partName)
                .append(" Hours Worked: ")
                .append(this.hoursWorked)
                .toString();
    }

}
