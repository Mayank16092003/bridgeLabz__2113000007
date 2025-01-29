package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class MostFrequent {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str=ip.nextLine();
        int[] frequency=new int[256];
        int max=0;
        char frequent='0';
        for(char ch:str.toCharArray()) {
            frequency[ch]++;
            if(frequency[ch]>max){
                max=frequency[ch];
                frequent=ch;
            }
        }
        System.out.println("most frequent character is '"+frequent+"' with frequency "+max);
    }
}
