package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class Multiplication {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number for multiplication");
        int num=input.nextInt();
        int mul;
        for(int i=6;i<=9;i++){
            mul=num*i;
            System.out.println(num+" * "+i+" = "+mul);
        }
    }
}
