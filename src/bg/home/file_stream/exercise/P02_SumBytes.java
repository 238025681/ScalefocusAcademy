/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.file_stream.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Chobi
 */
public class P02_SumBytes {

    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {

            String line = reader.readLine();
            long sum = 0;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum += (int) c;
                }
                line = reader.readLine();
            }
            System.out.println(sum);
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
