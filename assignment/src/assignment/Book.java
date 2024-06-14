package assignment;
public class Book {
    private String title;
    private String author;
    private String isbn;

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters for title, author, and isbn
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        // Create an object of the Book class using the parameterized constructor
        Book book = new Book("1984", "George Orwell", "123-4567891234");

        // Print the details of the book
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
