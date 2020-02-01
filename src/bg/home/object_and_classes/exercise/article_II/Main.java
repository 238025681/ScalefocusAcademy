/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.article_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static Scanner inputScaner;
    public static List<Article> articles;

    public static void main(String[] args) {
        inputScaner = new Scanner(System.in);
        articles = new ArrayList();
        int numberOfCommands = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            createArticle();
        }

        String SortingParameter = inputScaner.nextLine();

        articles.stream().sorted((a1, a2) -> a1.setSortParam(SortingParameter).compareTo(a2)).forEach(a1 -> System.out.println(a1));
    }

    public static void createArticle() {
        String[] inputArticle = inputScaner.nextLine().split(", ");
        String inputTitle = inputArticle[0];
        String inputContent = inputArticle[1];
        String inputAuthor = inputArticle[2];
        Article article = new Article(inputTitle, inputContent, inputAuthor);

        articles.add(article);
    }

}
