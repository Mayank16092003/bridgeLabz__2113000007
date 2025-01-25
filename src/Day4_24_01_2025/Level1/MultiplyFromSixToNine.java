package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class MultiplyFromSixToNine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for multiplication: ");
        int number=sc.nextInt();
        int[] multiplicationResult=new int[10];
        for(int i=6;i<=9;i++){
            multiplicationResult[i]=number*(i);
        }
        for(int j=6;j<10;j++){
            System.out.println(number+" * "+(j)+" = "+multiplicationResult[j]);
        }
    }
}

