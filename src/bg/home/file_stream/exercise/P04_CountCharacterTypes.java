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
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P04_CountCharacterTypes {

    public static final String VOWELS = "[aoueiAEIOU]";
    public static final String PUNCTUATION = "[!.,?]";

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
            int consonants = 0;
            int vowels = 0;
            int punctuation = 0;
            while ((line = reader.readLine()) != null) {
                char[] simbols = line.toCharArray();
                for (int i = 0; i < simbols.length; i++) {
                    if (("" + simbols[i]).matches(VOWELS)) {
                        vowels++;
                    } else if (("" + simbols[i]).matches(PUNCTUATION)) {
                        punctuation++;
                    } else if (!("" + simbols[i]).matches(" ")) {
                        consonants++;
                    }
                }

            }
            writer.printf("Vowels: %d%n", vowels);
            writer.printf("Consonants: %d%n", consonants);
            writer.printf("Punctuation: %d%n", punctuation);
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
