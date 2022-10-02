package src.task15.model;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final int price;
    private final int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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
        return "Title: " + title  +
                "; Author: " + author +
                "; Price: " + price +
                "; Edition: " + edition +
                "; ISBN: " + isbn;

    }

    @Override
    public int hashCode(){
        return title.hashCode() + author.hashCode() + price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return  price;
    }

    public int getEdition(){
        return edition;
    }

    public int getIsbn(){
        return isbn;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.getIsbn(), o.getIsbn());
    }
}
