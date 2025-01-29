package Day6_29_01_2025.Assignment2.Level1;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        checkPalindrome(input());
    }
    public static String input(){
        System.out.println("Enter an string to check");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    public static void checkPalindrome(String s){
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse))
            System.out.println(s+" is Palindrome");
        else
            System.out.println(s+" is Not a palindrome");
    }
}
