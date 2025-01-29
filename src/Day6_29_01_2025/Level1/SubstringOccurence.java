package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and substring: ");
        String str = input.nextLine().trim();
        String subStr = input.nextLine().trim();
        int subStrLength = subStr.length();
        int counter = 0;
        for(int i = 0; i <= str.length() - subStrLength; i++){
            if(str.substring(i, i+subStrLength).equals(subStr)){
                counter++;
            }
        }
        System.out.println("Occurence of substring : " + counter);
    }
}

