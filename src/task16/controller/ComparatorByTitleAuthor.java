package src.task16.controller;

import src.task16.model.Book;

import java.util.Comparator;

public class ComparatorByTitleAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0){
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        else
            return result;
    }
}
