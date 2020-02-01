/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.file_stream.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Chobi
 */
public class P07_MergeTwoFiles {

    public static void main(String[] args) throws IOException {
        String inputPathOne = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\inputOne.txt";
        String inputPathTwo = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\inputTwo.txt";
        String outputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\output.txt";

        try (BufferedReader readerOne = new BufferedReader(new FileReader(inputPathOne));
                BufferedReader readerTwo = new BufferedReader(new FileReader(inputPathTwo));
                PrintWriter writer = new PrintWriter(outputPath)) {

            String line = "";
            while ((line = readerOne.readLine()) != null) {
                writer.printf("%s%n", line);
            }
            while ((line = readerTwo.readLine()) != null) {
                writer.printf("%s%n", line);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
