package keywords;
public class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book("1994", "Mayank", "1234567890");
        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }
    }
}