package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class CheckNumberPosNegEvenOdd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("enter 5 numbers to check ");
        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==0)
                System.out.println("zero");
            else if(num[i]<0)
                System.out.println(num[i]+" is negative");
            else{
                if(num[i]%2==0)
                    System.out.println(num[i]+" is even");
                else
                    System.out.println(num[i]+" is odd");
            }
        }

    }

}
