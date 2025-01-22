package Day2.Level2;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int number1,number2;
        System.out.println("Enter the two numbers: ");
        Scanner input = new Scanner(System.in);
        number1=input.nextInt();
        number2=input.nextInt();
        int quotient=number1/number2;
        int remainder=number1%number2;
        System.out.println("quotient is "+quotient+" and remainder is "+remainder);
    }
}
