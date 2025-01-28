package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class NumberCheck {
    public int isNumber(int num){
        if(num==0)
            return 0;
        else if(num>0)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number to check ");
        int num=input.nextInt();
        NumberCheck nc=new NumberCheck();
        int status=nc.isNumber(num);
        if(status==0)
            System.out.println("number is negative");
        else if(status==1)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");
    }
}
