package Day6_29_01_2025.Level1;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter two string");
        String str1 = ip.nextLine();
        String str2 = ip.nextLine();
        if(str1.length()!=str2.length())
            System.out.println("Not anagram");
        else{
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2))
                System.out.println("Anagram");
            else
                System.out.println("Not anagram");
        }
    }
}
