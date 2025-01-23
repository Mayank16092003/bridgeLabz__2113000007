package Day3_23_01_2025.Level2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter year to checkout for leap ");
        int year = ip.nextInt();

        if (year < 1582)
            System.out.println("Provided Year must be greater than or equal to 1582 ");

        else {
            if (year%400==0)
                System.out.println(year + " is a Leap Year.");
            else if(year%100==0)
                System.out.println(year + " is not a Leap Year.");

            else if(year%4==0)
                System.out.println(year + " is a Leap Year.");
            else
                System.out.println(year + " is not a Leap Year.");
        }
    }
}