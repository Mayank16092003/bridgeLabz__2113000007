package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class SmallestOf3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter three numbers ");
        int num1 = ip.nextInt();
        int num_2 = ip.nextInt();
        int num_3 = ip.nextInt();
        if ((num1 < num_2) && (num1 < num_3))
            System.out.println("Is the first number the smallest?\nYes");
        else
            System.out.println("Is the first number the smallest?\nNo");

    }
}
