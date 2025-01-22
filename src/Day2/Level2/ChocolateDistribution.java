package Day2.Level2;
import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args){
        int numberOfChocolates;
        int numberOfStudents;
        Scanner input=new Scanner(System.in);
        System.out.println("enter total number of chocolates are ");
        numberOfChocolates=input.nextInt();
        System.out.println("enter total number of students are ");
        numberOfStudents=input.nextInt();
        int eachGet=numberOfChocolates/numberOfStudents;
        int remain=numberOfChocolates%numberOfStudents;
        System.out.println("each children gets "+eachGet+" remaining chocolates "+remain);
    }
}
