/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P04_Songs {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfLine = Integer.parseInt(inputScaner.nextLine());
        List<Song> songs = new ArrayList();
        for (int i = 0; i < numberOfLine; i++) {
            String[] input = inputScaner.nextLine().split("_");
            songs.add(new Song(input[0], input[1], input[2]));
        }
        String typeList = inputScaner.nextLine();
        if (!typeList.equals("all")) {
            songs
                    .stream()
                    .filter(s -> typeList.equals(s.getTypeList()))
                    .forEach(s -> System.out.println(s));
        } else {
            songs
                    .stream()
                    .forEach(s -> System.out.println(s));
        }

    }

    public static class Song {

        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.setTypeList(typeList);
            this.setName(name);
            this.setTime(time);
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return String.format("%s", this.getName());
        }

    }
}
