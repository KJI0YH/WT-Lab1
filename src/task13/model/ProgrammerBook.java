package src.task13.model;

import src.task12.model.Book;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;

    public ProgrammerBook(String title, String author, int price, String lang, int level) {
        super(title, author, price);
        this.language = lang;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj){
        ProgrammerBook book = (ProgrammerBook)obj;
        return (this.getTitle().equals(book.getTitle()) &&
                this.getAuthor().equals(book.getAuthor()) &&
                this.getPrice()== book.getPrice() &&
                this.getLanguage().equals(book.getLanguage()) &&
                this.getLevel() == book.getLevel());
    }

    @Override
    public String toString(){
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Edition: " + getEdition() + "\n" +
                "Language: " + getLanguage() + "\n" +
                "Level: " + getLevel();
    }

    @Override
    public int hashCode(){
        return getTitle().hashCode() + getAuthor().hashCode() + getPrice() + getLevel() + getLanguage().hashCode();
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel(){
        return level;
    }
}
