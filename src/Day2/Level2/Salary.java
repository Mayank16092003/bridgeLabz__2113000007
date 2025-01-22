package Day2.Level2;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary and bonus :");
        int salary = input.nextInt();
        int bonus = input.nextInt();
        int total;
        total = salary + bonus;
        System.out.println("The salary is INR "+salary+"and bonus is INR "+bonus+" Hence Total Income is INR "+total);

    }
}
