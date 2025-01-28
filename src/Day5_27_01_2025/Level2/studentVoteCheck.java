package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class studentVoteCheck {
    public static boolean canStudentVote(int age){
        if(age<0)
            return false;
        else {
            if(age<18)
                return false;
            else
                return true;
        }
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] ages=new int[10];
        System.out.println("Enter age of 10 students");
        for(int i=0;i<10;i++)
            ages[i]=ip.nextInt();
        for(int i=0;i<10;i++){
            if(canStudentVote(ages[i]))
                System.out.println("students with age "+ages[i]+" can vote");
            else
                System.out.println("students with age "+ages[i]+" can't vote");

        }
    }}





