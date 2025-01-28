package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("sum of n natural number is "+sum(num));
    }
    public static int  sum(int n){
        int sum=0;
        while(n>0) {
            sum+=n;
            n--;
        }
        return sum;
    }
}
