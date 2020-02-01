/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.company_roster;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Chobi
 */
public class Department {

    private List<Employee> employee;

    public Department() {
        this.employee = new ArrayList();
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void addEmployee(Employee employee) {
        this.employee.add(employee);

    }

}
