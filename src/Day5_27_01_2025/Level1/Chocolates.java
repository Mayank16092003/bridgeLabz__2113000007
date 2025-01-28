package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class Chocolates {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of chocolates and number of students");
        int numberOfChocolates=ip.nextInt();
        int numberOfChildren=ip.nextInt();
        int[] quotientAndRemainder=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        System.out.println("number of chocolates remaining are "+quotientAndRemainder[1]+". Each child gets "+quotientAndRemainder[0]+" chocolates");
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=0;
        int remainder=0;
        quotient=number/divisor;
        remainder=number%divisor;
        int[] quotientAndRemainder={quotient,remainder};
        return quotientAndRemainder;
    }
}
