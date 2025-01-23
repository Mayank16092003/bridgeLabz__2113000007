package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = ip.nextInt();
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}