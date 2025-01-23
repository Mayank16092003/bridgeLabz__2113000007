package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class Divisibility_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check divisibility : ");
        int number = input.nextInt();
        if(number%5==0)
            System.out.println("Is the number "+number+" divisible by 5"+" \nYes");
        else
            System.out.println("Is the number "+number+" divisible by 5"+" \nNo");
    }
}
