package src.task13;

import src.task13.model.ProgrammerBook;

public class Main {
    public static void main(String[] args){
        ProgrammerBook pBook = new ProgrammerBook("String matching algoritms", "Christian Charras", 10, "C", 1);
        System.out.println("toString: " + pBook.toString());
        System.out.println("hashCode: " + pBook.hashCode());
        ProgrammerBook anotherBook = new ProgrammerBook("String matching algoritms", "Christian Charras", 10, "C", 1);
        System.out.println("Equals: " + pBook.equals(anotherBook));
    }
}
