package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class MaxAndSecondMaxVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        long number = sc.nextLong();
        int maxDigit = 10;
        int index = 0;
        int[] digits = new int[maxDigit];
        while (number > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = (int)number % 10;
            number = number / 10;
            index++;
        }
        int max = 0, secondMax = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > max)
                max = digits[i];
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > secondMax && digits[i] != max)
                secondMax = digits[i];
        }
        System.out.println("maximum digit of a number is " + max);
        System.out.println("second maximum digit of a number is " + secondMax);
    }
}