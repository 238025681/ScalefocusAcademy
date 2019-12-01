/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P05_SoftUniParking {

    public static Map<String, String> parkingList = new LinkedHashMap();

    public static void main(String[] args) throws Exception {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandLine = inputScaner.nextLine().split("\\s+");
            String command = commandLine[0];
            String[] commandParams = Arrays.copyOfRange(commandLine, 1, commandLine.length);

            executeCommand(command, commandParams);
        }

        parkingList
                .entrySet()
                .stream()
                .forEach(p -> System.out.printf("%s => %s%n", p.getKey(), p.getValue()));
    }

    private static void executeCommand(String command, String[] commandParams) throws Exception {
        String user = commandParams[0];

        switch (command) {

            case "register":
                String licensePlateNumber = commandParams[1];

                if (parkingList.containsKey(user)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                } else {
                    registerUser(user, licensePlateNumber);
                }
                break;
            case "unregister":
                if (!parkingList.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found%n", user);
                } else {
                    unregisterUser(user);
                }
                break;
            default:
                throw new Exception("No such command: " + command);
        }
    }

    private static void unregisterUser(String user) {
        parkingList.remove(user);
        System.out.printf("%s unregistered successfully%n", user);
    }

    private static void registerUser(String user, String licensePlateNumber) {
        parkingList.put(user, licensePlateNumber);
        System.out.printf("%s registered %s successfully%n", user, licensePlateNumber);
    }
}
