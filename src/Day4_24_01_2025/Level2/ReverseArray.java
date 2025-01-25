package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        while(temp>0) {
            temp/=10;
            count++;
        }
        int[] reverse = new int[count];
        int i=0;
        while(number>0) {
            reverse[i++]=number%10;
            number/=10;
        }
        System.out.println("Number in reverse order ");
        for(int j=0;j<reverse.length;j++) {
            System.out.print(reverse[j]+" ");
        }
    }
}
