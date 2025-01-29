package Day6_29_01_2025.Assignment2.Level1;
import java.util.Scanner;
public class FibonacciGenerator{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        fibonacci(num);
    }
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        int next;
        System.out.print("fibonacci series upto "+n+" is\n"+a+" "+b+" ");
        for(int i=0;i<n;i++){
            next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }
    }
}
