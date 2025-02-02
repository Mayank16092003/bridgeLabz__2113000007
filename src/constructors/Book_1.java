package constructors;
public class Book_1{
    private String title;
    private String author;
    private double price;

    public Book_1() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    public Book_1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
