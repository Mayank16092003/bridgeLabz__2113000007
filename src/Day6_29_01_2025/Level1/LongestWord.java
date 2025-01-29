package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String res="";
        int max=0;
        for(String word:words.split(" ")){
            if(word.length()>max){
                max=word.length();
                res=word;
            }
        }
        System.out.println(res);
    }
}
