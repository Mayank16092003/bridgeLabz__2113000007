package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers ");
        int num1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();
        if ((num1 > num_2) && (num1 > num_3)) {
            System.out.println("Is the first number the largest?\nYes");
            System.out.println("Is the second number the largest?\nNo");
            System.out.println("Is the third number largest\nNo");
        }
        else if((num_2> num1) && (num_2 > num_3)) {
            System.out.println("Is the first number the largest?\nNo");
            System.out.println("Is the second number the largest?\nYes");

            System.out.println("Is the third number largest\nNo");
        }

        else
        {
            System.out.println("Is the first number the largest?\nNo");
            System.out.println("Is the second number the largest?\nNo");
            System.out.println("Is the third number largest\nYes");
        }


    }

}
