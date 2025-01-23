package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class Multiples{
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = ip.nextInt();
        System.out.println("Multiples of " + number);
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.print(i+" ");
            }
        }
    }
}