package src.task12;

import src.task12.model.Book;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Чем заняться в четвертом измерении?", "Мэтт Паркер", 5);
        System.out.println("toString: " + book.toString());
        System.out.println("hashCode: " + book.hashCode());
        Book anotherBook = new Book("Чем заняться в четвертом измерении?", "Мэтт Паркер", 55);
        System.out.println("Equals: " + book.equals(anotherBook));
    }
}
