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
public class P03_AllCapitals {

    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\input.txt";
        String outputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
                PrintWriter writer = new PrintWriter(outputPath)) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.println(line.toUpperCase());
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
