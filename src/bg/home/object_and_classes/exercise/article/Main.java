/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.article;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static Article article;

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] inputArticle = inputScaner.nextLine().split(", ");
        String inputTitle = inputArticle[0];
        String inputContent = inputArticle[1];
        String inputAuthor = inputArticle[2];
        article = new Article(inputTitle, inputContent, inputAuthor);
        int numberOfCommands = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] inputCommand = inputScaner.nextLine().split(": ");
            executeCommand(inputCommand);
        }
        System.out.println(article);

    }

    private static void executeCommand(String[] inputCommand) {
        String command = inputCommand[0];
        String param = inputCommand[1];

        switch (command.toLowerCase()) {
            case "edit":
                article.edit(param);
                break;
            case "changeauthor":
                article.changeAuthor(param);
                break;
            case "rename":
                article.rename(param);
                break;
            default:
                break;
        }

    }
}
