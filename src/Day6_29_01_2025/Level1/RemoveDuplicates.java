package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter string to remove duplicates");
        String str = ip.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ans.indexOf(ch)==-1){
                ans+=ch;
            }
        }
        System.out.println("String after removing duplicates is "+ans);
    }
}
