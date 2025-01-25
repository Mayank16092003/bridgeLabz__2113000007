package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = ip.nextInt();
        String[] s = new String[num];
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                s[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                s[i - 1] = "Buzz";
            } else {
                s[i - 1] = Integer.toString(i);
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
