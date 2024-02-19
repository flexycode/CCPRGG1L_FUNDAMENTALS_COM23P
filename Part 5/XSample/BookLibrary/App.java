// import the Scanner class
import java.util.Scanner;

public class BookLibrary {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Book[] books = createBookLibrary();
        displayBookLibrary(books);
    }

    static Book[] createBookLibrary() {
        System.out.print("Enter the number of books in the library: ");
        int numBooks = scan.nextInt();

        scan.nextLine(); // Consume the newline character

        Book[] books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scan.nextLine();
            System.out.print("Author: ");
            String author = scan.nextLine();
            System.out.print("Genre: ");
            String genre = scan.nextLine();

            books[i] = new Book(title, author, genre);
        }

        return books;
    }

    static void displayBookLibrary(Book[] books) {
        System.out.println("Book Library:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Genre: " + books[i].getGenre());
            System.out.println();
        }
    }
}

class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}