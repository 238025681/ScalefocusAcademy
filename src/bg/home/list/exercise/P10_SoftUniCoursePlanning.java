/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P10_SoftUniCoursePlanning {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(inputScaner.nextLine().split(", ")).collect(Collectors.toList());
        String input = "";
        while (!(input = inputScaner.nextLine()).equals("course start")) {

            String[] tokens = input.split(":");

            executeCommand(tokens, schedule);

        }
        int count = 1;
        for (String lesson : schedule) {
            
            System.out.println(String.format("%d.%s", count++, lesson));
        }
    }

    private static void executeCommand(String[] tokens, List<String> schedule) {
        String command = tokens[0].trim();
        String lessonTitle = tokens[1].trim();
        String exerciseTitle = String.join("", lessonTitle, "-Exercise");

        switch (command.toLowerCase()) {
            case "add":
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                }
                break;

            case "insert":
                int index = Integer.parseInt(tokens[2].trim());

                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }
                break;
            case "remove":
                if (schedule.contains(lessonTitle)) {
                    schedule.remove(lessonTitle);

                    if (schedule.contains(exerciseTitle)) {
                        schedule.remove(lessonTitle);
                    }
                }

                break;
            case "swap":
                String lessonToSwap = tokens[2];
                //Swap:{lessonTitle}:{lessonTitle}
                int firstLessonIndex = schedule.indexOf(lessonTitle);
                if (schedule.contains(lessonTitle) && schedule.contains(lessonToSwap)) {
                    int secondLessonIndex = schedule.indexOf(lessonToSwap);
                    Collections.swap(schedule, firstLessonIndex, secondLessonIndex);

                    
                    if (schedule.contains(exerciseTitle)) {
                        schedule.remove(exerciseTitle);
                        schedule.add(schedule.indexOf(lessonTitle) + 1, exerciseTitle);
                    }

                    String exerciseToSwap = schedule.contains(String.join("", lessonToSwap, "-Exercise"))
                            ? String.join("", lessonToSwap, "-Exercise")
                            : "";
                    if (!"".equals(exerciseToSwap)) {

                        schedule.remove(exerciseToSwap);
                        schedule.add(schedule.indexOf(lessonToSwap) + 1, exerciseToSwap);

                    }
                }

                break;
            case "exercise":
                if (schedule.contains(lessonTitle) && !(schedule.contains(exerciseTitle))) {
                    schedule.add(schedule.indexOf(lessonTitle) + 1, exerciseTitle);
                } else if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                    schedule.add(exerciseTitle);
                }

                break;
        }
    }

}
