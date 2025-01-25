package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class CheckAgeAndVote {
    public static void main(String[] args){
        int[] age=new int[10];
        System.out.print("enter age of 10 students: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]<0)
                System.out.println("Invalid age");
            else {
                if(age[i]<18)
                    System.out.println("The students with age "+age[i]+" cannot vote");
                else
                    System.out.println("The students with age "+age[i]+" can vote");
            }
        }
    }
}
