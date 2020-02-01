/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite.models;
import java.text.DecimalFormat;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {

        //Name: <firstName> <lastName> Id: <id> Salary: <salary>
        return new StringBuilder()
                .append("Name: ")
                .append(this.getFirstName())
                .append(" ")
                .append(this.getLastName())
                .append(" Id: ")
                .append(this.getId())
                .append(" Salary: ")
                .append(new DecimalFormat("0.00").format(this.getSalary()))
                .toString();
    }

}
