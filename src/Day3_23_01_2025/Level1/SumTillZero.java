package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class SumTillZero {
    public static void main(String[] args) {
        double check=0.0;
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        System.out.println("enter value till zero encountered");
        double num=sc.nextDouble();
        while(num!=check){
            sum+=num;
            double input=sc.nextDouble();
            num=input;
        }
        System.out.println(sum);
    }
}
