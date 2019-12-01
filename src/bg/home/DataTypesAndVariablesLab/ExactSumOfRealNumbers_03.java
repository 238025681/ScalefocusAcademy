/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class ExactSumOfRealNumbers_03 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int count = Integer.parseInt(inputScaner.nextLine());
        BigDecimal result = new BigDecimal(BigInteger.ZERO);

        for (int i = 0; i < count; i++) {
            result = result.add(new BigDecimal(inputScaner.nextLine()));
        }
        System.out.println(result);
    }
}
