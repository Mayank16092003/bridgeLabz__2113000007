package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class Sum {
    public static int sumUsingRecursion(int num){
        if(num==1)
            return 1;
        return num+sumUsingRecursion(num-1);
    }
    public static int sumUsingFormula(int num){
        int sum=0;
        sum=num*(num+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=ip.nextInt();
        int a=sumUsingRecursion(num);
        System.out.println("Using recursion the sum of "+num+"natural number is "+a);
        System.out.println("Using formula the sum of "+num+"natural number is "+sumUsingFormula(num));
        if(a==sumUsingFormula(num))
            System.out.println("Both results are true");
        else
            System.out.println("Some error occurred as results are not same");
    }
}
