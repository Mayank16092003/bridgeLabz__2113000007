package Day2.Level2;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two Number: ");
        a = input.nextInt();
        b = input.nextInt();
        int c;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping a="+a+" and b="+b);

    }
}
