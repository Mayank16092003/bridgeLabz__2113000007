package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class CountVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        char[] words=word.toCharArray();
        int vowel=0,consonent=0;
        for(int i=0;i<words.length;i++){
            if((words[i]<='z'&&words[i]>='a')||(words[i]<='Z'&&words[i]>='A')) {
                if (words[i] == 'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'o' || words[i] == 'u' || words[i] == 'A' || words[i] == 'E' || words[i] == 'I' || words[i] == 'O' || words[i] == 'U')
                    vowel++;
                else
                    consonent++;
            }
            else
                continue;
        }
        System.out.println(consonent+" consonent are present and no. of vowel are "+vowel);
    }

}
