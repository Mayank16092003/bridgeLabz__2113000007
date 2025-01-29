package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter string to toggle");
        String str = ip.nextLine();
        String newStr="";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                newStr+=Character.toLowerCase(c);
            }
            else{
                newStr+=Character.toUpperCase(c);
            }
        }
        System.out.println(newStr);
    }
}
