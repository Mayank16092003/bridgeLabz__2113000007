package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class Handshakes {
    public int handshake(int numberOfStudents){
        int handshakes=numberOfStudents*(numberOfStudents-1)/2;
        return handshakes;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents=input.nextInt();
        Handshakes hs=new Handshakes();
        System.out.println("total number of possible handshakes are "+hs.handshake(numberOfStudents));
    }
}
