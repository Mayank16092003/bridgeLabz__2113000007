package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class Factors{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = ip.nextInt();
        System.out.println("Factors of " + number + " are ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(" "+i);
            }
        }
    }
}
