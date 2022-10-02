package src.task14;

import src.task14.model.Book;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Чем заняться в четвертом измерении?", "Мэтт Паркер", 5);
        Book anotherBook = book.clone();
        System.out.println("Book: " + book.toString());
        System.out.println("Clone book" + anotherBook.toString());
    }
}
