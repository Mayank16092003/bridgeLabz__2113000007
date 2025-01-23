package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class FactorialFor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=1;
        if(n>0) {
            for(int i=n;i>0;i--) {
                fact = i* fact;

            }
            System.out.println("factorial of given number is "+fact);
        }
        else
            System.out.println("number is negative hence factorial cannot be calculated");

    }
}
