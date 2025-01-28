package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class SmalllestLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] arr=new int[2];
        int smallest,largest;
        if(number1>number2 && number1>number3){
            largest=number1;
        }
        else if(number2>number1 && number2>number3){
            largest=number2;
        }
        else
            largest=number3;
        if(number1<number2 && number1<number3){
            smallest=number1;
        }
        else if(number2<number1 && number2<number3){
            smallest=number2;
        }
        else
            smallest=number3;
        arr[0]=smallest;
        arr[1]=largest;
        return arr;
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter three number");
        int number1=ip.nextInt();
        int number2=ip.nextInt();
        int number3=ip.nextInt();
        int[] SmallAndLarge=findSmallestAndLargest(number1,number2,number3);
        System.out.println("Smallest number and largest number is "+SmallAndLarge[0]+" and "+SmallAndLarge[1]+" respectively");
    }
}
