package Day3_23_01_2025.Level1;
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args){
            Scanner ip = new Scanner(System.in);
            System.out.println("enter a number to check  ");
            int num = ip.nextInt();
            if (num>0)
                System.out.println("positive");
            else if(num<0)
                System.out.println("negative");
            else
                System.out.println("zero");


    }
}
