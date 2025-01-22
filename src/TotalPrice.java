package Day2.Level1;
import java.util.Scanner;
public class TotalPrice {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the unit price and quantity of your product");
    int unitPrice,quantity;
    unitPrice = input.nextInt();
    quantity = input.nextInt();
    int totalPrice = unitPrice * quantity;
    System.out.println("The total purchase price is INR "+unitPrice+" if the quantity is "+quantity+" and unit price is INR "+totalPrice);
    }
}
