package Day2.Level1;
import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of number of students: ");
        int numberOfStudents = input.nextInt();
        int maxHandshakes=numberOfStudents*(numberOfStudents-1)/2;
        System.out.println("maximum no. handshakes possible "+maxHandshakes);
    }
}