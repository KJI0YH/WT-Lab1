package src.task16;

import src.task16.controller.ComparatorByAuthorTitle;
import src.task16.controller.ComparatorByAuthorTitlePrice;
import src.task16.controller.ComparatorByTitle;
import src.task16.controller.ComparatorByTitleAuthor;
import src.task16.model.Book;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Title1", "Author1", 1);
        Book book2 = new Book("Title2", "Author2", 2);
        Book book3 = new Book("Title1", "Author2", 2);
        Book book4 = new Book("Title2", "Author1", 2);
        Book book5 = new Book("Title1", "Author1", 2);
        ComparatorByTitle comparatorByTitle = new ComparatorByTitle();
        ComparatorByTitleAuthor comparatorByTitleAuthor = new ComparatorByTitleAuthor();
        ComparatorByAuthorTitle comparatorByAuthorTitle = new ComparatorByAuthorTitle();
        ComparatorByAuthorTitlePrice comparatorByAuthorTitlePrice = new ComparatorByAuthorTitlePrice();

        System.out.println("Compare: " + comparatorByTitle.compare(book1, book2));
        System.out.println("Compare: " + comparatorByTitleAuthor.compare(book3, book1));
        System.out.println("Compare: " + comparatorByAuthorTitle.compare(book1, book4));
        System.out.println("Compare: " + comparatorByAuthorTitlePrice.compare(book5, book1));

    }
}
