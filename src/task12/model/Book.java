package src.task12.model;

public class Book {
    private final String title;
    private final String author;
    private final int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        Book book = (Book)obj;
        return (this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.price == book.price);
    }

    @Override
    public String toString(){
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Price: " + price + "\n" +
                "Edition: " + edition;
    }

    @Override
    public int hashCode(){
        return title.hashCode() + author.hashCode() + price;
    }


}
