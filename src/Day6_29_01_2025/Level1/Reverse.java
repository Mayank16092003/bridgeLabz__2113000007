package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str = ip.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("reversed string is "+reverse);
    }
}
