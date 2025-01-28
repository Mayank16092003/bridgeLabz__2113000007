package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle){
        double angleD=Math.toRadians(angle);
        double[] result=new double[6];
        result[0]=Math.cos(angleD);
        result[1]=Math.sin(angleD);
        result[2]=Math.tan(angleD);
        result[3]=1/result[0];
        result[4]=1/result[1];
        result[5]=1/result[2];
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle of a triangle in degree");
        double angle=sc.nextDouble();
        double[] result=calculateTrigonometricFunctions(angle);
        System.out.println("value of sin("+angle+") is "+result[1]);
        System.out.println("value of cos("+angle+") is "+result[0]);
        System.out.println("value of tan("+angle+") is "+result[2]);
        System.out.println("value of cosec("+angle+") is "+result[4]);
        System.out.println("value of sec("+angle+") is "+result[3]);
        System.out.println("value of cot("+angle+") is "+result[5]);

    }

}
