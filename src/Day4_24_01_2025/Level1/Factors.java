package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int[] factors=new int[num/2];
        int j=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                factors[j++]=i;
            }
        }
        System.out.print("factors of "+num+" are ");
        for(int i=0;i<j;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
