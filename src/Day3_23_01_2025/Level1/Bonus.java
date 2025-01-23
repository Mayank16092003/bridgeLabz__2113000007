package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class Bonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary,year;
        double bonus;
        System.out.print("enter salary of a person");
        salary=sc.nextInt();
        System.out.print("enter years of service");
        year=sc.nextInt();
        if(year>5) {
            bonus = salary * 0.05;
            System.out.println("bonus amount on given salary is " + bonus);
        }
        else
            System.out.println("no bonus amount as given year of service is less than 5");

    }
}
