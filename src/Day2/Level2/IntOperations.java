package Day2.Level2;
import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int x,y,z,w;
        x=a+b*c;
        y=a*b+c;
        z=c+a/b;
        w=a%b+c;
        System.out.println("result of Int operations is "+x+" "+y+" "+z+" "+w);
    }
}
