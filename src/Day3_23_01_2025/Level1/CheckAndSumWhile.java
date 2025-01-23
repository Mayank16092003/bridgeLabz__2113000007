package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class CheckAndSumWhile {
    public static void main(String[] args) {
            Scanner ip=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=ip.nextInt();
            int sum_while=0;
            int sum_formula=0;
            if(n>0) {
                sum_formula = n * (n + 1) / 2;
                sum_while = 0;
                while (n > 0) {
                    sum_while += n;
                    n--;
                }


                if (sum_while == sum_formula)
                    System.out.println("Both results are same and the sum is " + sum_while);
                else
                    System.out.println("some error ocured");
            }
            else
                System.out.println("The number "+n+" is not a natural number");
    }
}
