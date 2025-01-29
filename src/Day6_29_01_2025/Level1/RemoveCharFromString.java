package Day6_29_01_2025.Level1;
import java.util.Scanner;
public class RemoveCharFromString {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter string ");
        String str=ip.nextLine();
        System.out.println("Enter character to remove its occurences");
        char character=ip.next().charAt(0);
        String remove="";
        for(char ch:str.toCharArray()){
            if(ch==character){
                remove+="";
            }
            else{
                remove+=ch;
            }
        }
        System.out.println("after removing "+character+" remaining string is "+remove);

    }
}
