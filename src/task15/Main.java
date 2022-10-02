package src.task15;

import src.task15.model.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Title", "Author", 5, 100);
        Book book2 = new Book("Title", "Author", 5, 101);
        Book book3 = new Book("Title", "Author", 5, 99);
        Book book4 = new Book("Title", "Author", 5, 100);
        System.out.println("Compare: " + book1.compareTo(book2));
        System.out.println("Compare: " + book1.compareTo(book3));
        System.out.println("Compare: " + book1.compareTo(book4));
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println("Initial array: ");
        for (Book book: books){
            System.out.println(book.toString() + "; ");
        }

        books.sort(Book::compareTo);
        System.out.println("Sorted array: ");
        for (Book book: books){
            System.out.println(book.toString() + "; ");
        }
    }
}
