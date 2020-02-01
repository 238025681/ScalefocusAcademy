/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.file_stream.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P06_WordCount {

    public static void main(String[] args) throws IOException {
        String listOfWord = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\words.txt";
        String inputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\text.txt";
        String outputPath = "C:\\ScaleFocus"
                + "\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources"
                + "\\Exercises Resources\\output.txt";

        Map<String, Integer> result = new LinkedHashMap();
        File text = new File(inputPath);
        File filePattern = new File(listOfWord);
        try (
                Scanner wordsPattern = new Scanner(filePattern);
                PrintWriter writer = new PrintWriter(outputPath)) {

            Scanner reader = null;
            while (wordsPattern.hasNext()) {
                String pattern = wordsPattern.next();
                if (!result.containsKey(pattern)) {
                    result.put(pattern, 0);
                }
                reader = new Scanner(text);
                while (reader.hasNext()) {
                    if (reader.next().equals(pattern)) {
                        int count = result.get(pattern) + 1;
                        result.put(pattern, count);
                    }
                }

            }
            result
                    .entrySet()
                    .stream()
                    .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                    .forEach(s -> writer.printf("%s - %d%n", s.getKey(), s.getValue()));
            reader.close();
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
