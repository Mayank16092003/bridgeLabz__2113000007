package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class EvenAndOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if(number<=0){
            System.err.println("Invalid Number as range cannot be negative or zero");
            System.exit(0);
        }
        int[] oddArr=new int[number/2+1];
        int[] evenArr=new int[number/2+1];
        int odd=0,even=0;
        for(int i=1;i<=number;i++){
            if(i%2==0)
                evenArr[even++]=i;
            else
                oddArr[odd++]=i;
        }
        System.out.println("even numbers of given range are: ");
        for(int i=0;i<even;i++)
            System.out.print(evenArr[i]+" ");
        System.out.println("\nodd numbers of given range are: ");
        for(int i=0;i<odd;i++)
            System.out.print(oddArr[i]+" ");
    }
}
