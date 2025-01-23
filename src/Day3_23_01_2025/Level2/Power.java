package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int number = ip.nextInt();
        System.out.print("Enter the power: ");
        int pow = ip.nextInt();
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res *= number;
        }
        System.out.println("Result: " + res);
    }
}