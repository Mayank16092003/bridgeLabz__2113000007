package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter number for even/odd range");
        int n=ip.nextInt();
        if(n>0)
        {
            for(int i=1;i<=n;i++){
                if(i%2==0)
                    System.out.println(i+" is even number");
                else
                    System.out.println(i+" is odd number");
            }
        }
        else
            System.out.println("number is negative ");
    }
}
