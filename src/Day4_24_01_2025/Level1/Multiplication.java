package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for multiplication: ");
        int num=input.nextInt();
        int[] mul=new int[10];
        for(int i=0;i<10;i++){
            mul[i]=num*(i+1);
        }
        for(int j=0;j<10;j++){
            System.out.println(num+" * "+(j+1)+" = "+mul[j]);
        }
    }
}
