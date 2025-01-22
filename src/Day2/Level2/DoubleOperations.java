package Day2.Level2;
import java.util.Scanner;
public class DoubleOperations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three integer: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x,y,z,w;
        x=a+b*c;
        y=a*b+c;
        z=c+a/b;
        w=a%b+c;
        System.out.println("result of double operations is "+x+" "+y+" "+z+" "+w);
    }
}
