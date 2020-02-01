/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.file_stream.exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Chobi
 */
public class P01_SumLines {

    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\ScaleFocus\\readFile\\Excercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))) {

            String line = reader.readLine();
            while (line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
