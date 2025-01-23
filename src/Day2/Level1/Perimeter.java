package Day2.Level1;

import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter: ");
        float perimeter = input.nextFloat();
        float length=perimeter/4;
        System.out.println("length of side is "+length);

    }
}
