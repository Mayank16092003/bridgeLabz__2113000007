package Day6_29_01_2025.Assignment2.Level1;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        if(prime(num))
            System.out.println(num+" is a prime");
        else
            System.out.println(num+" not a prime number");
    }
    public static boolean prime(int num) {
        if(num==2)
            return true;
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
