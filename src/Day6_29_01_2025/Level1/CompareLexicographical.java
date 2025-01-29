package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class CompareLexicographical {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str1=ip.nextLine();
        String str2=ip.nextLine();
        int str1Length=str1.length();
        int str2Length=str2.length();
        if(str1Length>str2Length){
            int index=0;
            for(char i:str2.toCharArray()){
                char a=str1.charAt(index);
                if(a>i){
                    System.out.println(str2 +" comes before "+str1+" lexicographically");
                    break;
                }
                else if(a<i){
                    System.out.println(str1 +" comes before "+str2+" lexicographically");
                    break;
                }
                else {
                    index++;
                }
            }
            System.out.println(str2 +" comes before "+str1+" lexicographically");
        }
        else if(str2Length>str1Length){
            int index=0;
            for(char i:str1.toCharArray()){
                char a=str2.charAt(index);
                if(a>i){
                    System.out.println(str1 +" comes before "+str2+" lexicographically");
                    break;
                }
                else if(a<i){
                    System.out.println(str2 +" comes before "+str1+" lexicographically");
                    break;
                }
                else
                    index++;
            }
            System.out.println(str1 +" comes before "+str2+" lexicographically");
        }
        else {
            int index = 0;
            for(char i:str1.toCharArray()){
                char a=str2.charAt(index);
                if(a>i){
                    System.out.println(str1 +" comes before "+str2+" lexicographically");
                    break;
                }
                else if(a<i){
                    System.out.println(str2 +" comes before "+str1+" lexicographically");
                    break;
                }
                else
                    index++;
            }
            if(index==str2.length()){
                System.out.println("both are lexicographically same");
            }
        }
    }
}
