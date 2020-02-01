/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.exercise.article_II;

/**
 *
 * @author Chobi
 */
public class Article implements Comparable<Article> {

    private String title;
    private String content;
    private String author;
    private String sortParam;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Article setSortParam(String sortParam) {
        this.sortParam = sortParam;
        return this;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void rename(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return new StringBuilder(title)
                .append(" - ")
                .append(content)
                .append(": ")
                .append(author)
                .toString();
    }

    @Override
    public int compareTo(Article o) {
        switch (sortParam) {
            case "title":
                return this.title.compareTo(o.getTitle());
            case "content":
                return this.content.compareTo(o.getContent());
            case "author":
                return this.author.compareTo(o.getAuthor());
            default:
                return 0;
        }
    }

}
