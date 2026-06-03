package Pratikum14;

public class Book {

    public String isbn;
    public String title;

    public Book() {

    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}