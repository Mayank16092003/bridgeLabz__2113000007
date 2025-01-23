package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = ip.nextInt();
        int greatestFac = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                greatestFac = i;
                break;
            }
        }
        System.out.println("Greatest Factor: " + greatestFac);}
}