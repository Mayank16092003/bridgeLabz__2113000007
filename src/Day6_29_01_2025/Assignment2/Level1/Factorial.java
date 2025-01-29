package Day6_29_01_2025.Assignment2.Level1;
 import java.util.Scanner;
public class Factorial {
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int result) {
        System.out.println("The factorial is: " + result);
    }
    public static void main(String[] args) {
        int num = input();
        int result = calculateFactorial(num);
        displayResult(result);
    }
}
