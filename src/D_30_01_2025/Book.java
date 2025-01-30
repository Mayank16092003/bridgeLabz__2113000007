package D_30_01_2025;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter title: ");
        String title=ip.next();
        System.out.println("Enter name of author: ");
        String author=ip.next();
        System.out.println("Enter price: ");
        double price=ip.nextDouble();
        Book book1 = new Book(title,author,price);
        book1.displayDetails();
    }
}