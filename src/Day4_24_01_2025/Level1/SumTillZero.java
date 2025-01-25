package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class SumTillZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        double[] arr=new double[n];
        int i=0;
        double total=0.0;
        double num;
        System.out.println("enter elements ");
        while(true){
            if(i>=10)
                break;
            num=sc.nextInt();
            if(num<=0.0)
                break;
            else
                arr[i++]=num;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
            total+=arr[j];
        }
        System.out.println("total of all values is "+total);
    }
}
