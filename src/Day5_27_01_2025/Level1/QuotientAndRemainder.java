package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter number and divisor ");
        int number = ip.nextInt();
        int divisor = ip.nextInt();
        int[] quotientAndRemainder=findRemainderAndQuotient(number,divisor);
        System.out.println("quotient and remainder are "+quotientAndRemainder[0]+" "+quotientAndRemainder[1]+" respectively");
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = 0;
        int remainder = 0;
        quotient = number / divisor;
        remainder = number % divisor;
        int[] arr={quotient,remainder};
        return arr;
    }
}
