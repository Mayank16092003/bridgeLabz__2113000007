package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class SimpleInterest {
    public void simpleInterest(int p, int r, int t){
        int interest;
        interest=p*r*t/100;
        System.out.println("The simple interest is "+interest+" for principal "+p+" rate of interest "+r+" and time "+t);
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter principal,rate and time respectively ");
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();
        SimpleInterest si = new SimpleInterest();
        si.simpleInterest(principal, rate, time);
    }
}
