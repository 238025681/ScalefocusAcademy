/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

/**
 *
 * @author Chobi
 */
public class BinaryTest {
    public static void main(String[] args) {
        //Scanner inputScaner = new Scanner(System.in);
        int a = Integer.parseInt("110", 2);
        int b = ~a&Integer.parseInt("100", 2);;//Integer.parseInt("011", 2);
        int c = (a^b)>>>1;
        int d = ~c&Integer.parseInt("001", 2);;//Integer.parseInt("011", 2);
        
        System.out.println(Integer.toBinaryString((c)));
        System.out.println(Integer.toBinaryString((d)));
        System.out.println(Integer.toBinaryString((c|d)>>>1));
        System.out.println(Integer.toBinaryString((c&d)>>>1));
        System.out.println(Integer.toBinaryString((c^d)>>>1));
    }
    
}
