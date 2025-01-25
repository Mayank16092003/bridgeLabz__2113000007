package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputNum = scanner.nextLine();
        int[] frequency = new int[10];
        for (int i = 0; i < inputNum.length(); i++) {
            char digitChar = inputNum.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                frequency[digit]++;
            }
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}