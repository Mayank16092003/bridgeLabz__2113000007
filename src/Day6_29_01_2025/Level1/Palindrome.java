package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = ip.nextLine();
        String palindrome="";
        int count=0;
        for (int i = str.length()-1;i>=0 ;i--) {
            palindrome += str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=palindrome.charAt(i)){
                System.out.println("Not a palindrome");
                break;
            }
            count++;
        }
        if(count==str.length()){
            System.out.println("Palindrome");
        }

    }
}
