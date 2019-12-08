/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Chobi
 */
public class P08_CompanyUsers {

    public static Map<String, Set<String>> employeeList = new LinkedHashMap();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";
        while (!(input = inputScaner.nextLine()).toLowerCase().equals("end")) {
            String tokens[] = input.split(" -> ");

            setEmployeeList(tokens);

        }
        employeeList
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(e->System.out.printf("-- %s%n", e));
        });
    }

    private static void setEmployeeList(String[] tokens) {
        String companyName = tokens[0];
        String employeeId = tokens[1];

        employeeList.computeIfAbsent(companyName, e -> new LinkedHashSet()).add(employeeId);

    }
}
