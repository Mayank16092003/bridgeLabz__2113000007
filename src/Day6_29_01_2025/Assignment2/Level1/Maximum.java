package Day6_29_01_2025.Assignment2.Level1;
import java.util.Scanner;
public class Maximum {
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Maximum of given three numbers is "+max(num1,num2,num3));
    }
    public static int max(int a, int b, int c){
        int max=Math.max(Math.max(a,b),c);
        return max;
    }
    public static void main(String[] args) {
        input();
    }

}
