package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class MaxAndSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        int maxDigit=10;
        int index=0;
        int[] digits=new int[maxDigit];
        while(number>0){
            digits[index]=number%10;
            number=number/10;
            index++;
            if(index==maxDigit){
                break;
            }
        }
        int max=0,secondMax=0;
        for(int i=0;i<maxDigit;i++){
            if(digits[i]>max)
                max=digits[i];
        }
        for(int i=0;i<maxDigit;i++){
            if(digits[i]>secondMax&&digits[i]!=max)
                secondMax=digits[i];
        }
        System.out.println("maximum digit of a number is "+max);
        System.out.println("second maximum digit of a number is "+secondMax);
    }
}
