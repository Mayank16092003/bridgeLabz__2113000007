package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class Replace {
    public static String replace(String s, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string of words ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the new word: ");
        String newWord = sc.next();
        String newSentence = replace(sentence, oldWord, newWord);
        System.out.println("new string of words: " + newSentence);
    }}