package Day2.Level2;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount ");
        int principal = input.nextInt();
        System.out.print("Enter no. of years ");
        int year = input.nextInt();
        System.out.print("Enter rate of interest ");
        float rate = input.nextFloat();
        float interest = principal * year * rate/100;
        System.out.println("The Simple Interest is "+interest+" for Principal "+principal+" Rate of Interest "+rate+"and Time "+year);
    }
}
