package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class Factors {
    public static int[] factors(int num){
        int count=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                count++;
        }
        int[] factors = new int[count];
        int index=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                factors[index++]=i;
        }
        return factors;

    }
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    public static int ProductOfFactors(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    public static int sumOfSquareOfFactors(int[] factors){
        int sumOfSq=0;
        for(int i=0;i<factors.length;i++){
            sumOfSq+=Math.pow(factors[i],2);
        }
        return sumOfSq;
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=ip.nextInt();
        int[] factors=factors(num);
        System.out.print("The factors of "+num+" are ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        int sum=sumOfFactors(factors);
        System.out.println("\nThe sum of factors of "+num+" is "+sum);
        int product=ProductOfFactors(factors);
        System.out.println("The product of factors of "+num+" is "+product);
        int sumOfSq=sumOfSquareOfFactors(factors);
        System.out.println("the sum of squares of factors of "+num+" is "+sumOfSq);

    }
}
