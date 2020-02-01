/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.interfaces_and_abstraction.military_elite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Commando;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Engineer;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.LeutenantGeneral;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Private;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Soldier;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.Spy;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.enumerations.Corps;
import bg.home.interfaces_and_abstraction.military_elite.interfaces.enumerations.State;
import bg.home.interfaces_and_abstraction.military_elite.models.CommandoImpl;
import bg.home.interfaces_and_abstraction.military_elite.models.EngineerImpl;
import bg.home.interfaces_and_abstraction.military_elite.models.LeutenantGeneralImpl;
import bg.home.interfaces_and_abstraction.military_elite.models.Mission;
import bg.home.interfaces_and_abstraction.military_elite.models.PrivateImpl;
import bg.home.interfaces_and_abstraction.military_elite.models.Repair;
import bg.home.interfaces_and_abstraction.military_elite.models.SpyImpl;

/**
 *
 * @author Chobi
 */
public class Main {

    private static Map<Integer, Soldier> soldiers;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        soldiers = new LinkedHashMap();
        String input = "";

        while (!"end".equalsIgnoreCase((input = inputScaner.nextLine()))) {

            String[] tokens = input.split("\\s+");
            String soldier = tokens[0];

            executeCommand(soldier, Arrays.copyOfRange(tokens, 1, tokens.length));
        }

        soldiers.values().forEach(s -> System.out.println(s.toString().trim()));

    }

    private static void executeCommand(String soldier, String... parameters) {

        int id = Integer.parseInt(parameters[0]);
        String firstName = parameters[1];
        String lastName = parameters[2];
        double salary;
        String corps;

        switch (soldier) {
            case "Private":
                salary = Double.parseDouble(parameters[3]);
                Private privateSoldier = new PrivateImpl(id, firstName, lastName, salary);
                soldiers.putIfAbsent(privateSoldier.getId(), privateSoldier);

                break;
            case "LeutenantGeneral":
                salary = Double.parseDouble(parameters[3]);
                LeutenantGeneral leutenantGeneral = new LeutenantGeneralImpl(id, firstName, lastName, salary);
                getPrivateUnits(Arrays.copyOfRange(parameters, 4, parameters.length), leutenantGeneral);
                soldiers.putIfAbsent(leutenantGeneral.getId(), leutenantGeneral);

                break;
            case "Engineer":

                salary = Double.parseDouble(parameters[3]);
                corps = parameters[4];
                if (Corps.contains(corps)) {

                    List<Repair> repairs = getRepairs(Arrays.copyOfRange(parameters, 5, parameters.length));
                    Engineer engineer = new EngineerImpl(id, firstName, lastName, salary, corps, repairs);
                    soldiers.putIfAbsent(engineer.getId(), engineer);
                }

                break;
            case "Commando":
                salary = Double.parseDouble(parameters[3]);
                corps = parameters[4];
                if (Corps.contains(corps)) {

                    List<Mission> missions = getMissions(Arrays.copyOfRange(parameters, 5, parameters.length));
                    Commando commando = new CommandoImpl(id, firstName, lastName, salary, corps, missions);
                    soldiers.putIfAbsent(commando.getId(), commando);
                }
                break;
            case "Spy":
                int codeNumber = Integer.parseInt(parameters[3]);
                Spy spy = new SpyImpl(id, firstName, lastName, codeNumber);
                soldiers.putIfAbsent(spy.getId(), spy);
                break;
            default:
                break;

        }

    }

    private static void getPrivateUnits(String[] units, LeutenantGeneral leutenantGeneral) {
        for (String unit : units) {
            leutenantGeneral.addPrivate((Private) soldiers.get(Integer.parseInt(unit)));
        }

    }

    private static List<Repair> getRepairs(String[] params) {
        List<Repair> result = new ArrayList<>();
        for (int i = 0; i < params.length - 1; i += 2) {

            result.add(new Repair(params[i], Integer.parseInt(params[i + 1])));
        }
        return result;
    }

    private static List<Mission> getMissions(String[] params) {
        List<Mission> result = new ArrayList<>();
        for (int i = 0; i < params.length - 1; i += 2) {
            if (State.contains(params[i + 1])) {
                result.add(new Mission(params[i], params[i + 1]));
            }
        }

        return result;
    }
}
