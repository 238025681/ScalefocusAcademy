/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chobi
 */
public class PasswordValidator_04 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
 
        boolean isBetweenSixAndTenCharacters = checkIsBetweenSixAndTenCharacters(password);
        boolean onlyLettersAndDigit = checkIfOnlyLettersAndDigits(password.toLowerCase());
        boolean hasAtleastTwoDigits = checkIfHasAtleastTwoDigits(password);
 
        if (!isBetweenSixAndTenCharacters) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersAndDigit) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasAtleastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
 
        if (isBetweenSixAndTenCharacters && onlyLettersAndDigit && hasAtleastTwoDigits) {
            System.out.println("Password is valid");
        }
    }
 
    private static boolean checkIsBetweenSixAndTenCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }
 
 
    private static boolean checkIfHasAtleastTwoDigits(String password) {
        int countOfDigits = 0;
 
        Pattern pattern = Pattern.compile("[0-9]+");
 
        Matcher match = pattern.matcher(password);
        while (match.find()) {
            countOfDigits += match.group(0).length();
            if (countOfDigits >= 2) {
                return true;
            }
        }
 
        return false;
    }
 
 
    private static boolean checkIfOnlyLettersAndDigits(String password) {
        boolean result = true;
 
        Pattern pattern = Pattern.compile("^[0-9A-Za-z]+$");
 
        Matcher match = pattern.matcher(password);
        if (!match.find()) {
            result = false;
        }
 
 
        return result;
    }
}
