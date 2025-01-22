package Day2.Level1;
import java.util.Scanner;
public class Fees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fees=input.nextInt();
        int discountPercent=input.nextInt();
        System.out.print("Discount percent: "+discountPercent);
        System.out.println(" Fees: "+fees);
        int discount=discountPercent*fees/100;
        int feesPaid=fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feesPaid);
    }
}

