package Day2.Level1;
import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height in centimeters: ");
        int height = input.nextInt();
        float heightInInches=height/2.54f;
        float heightInFeet=heightInInches/12f;
        System.out.println("Height in inches is " + heightInInches+" Height in foot is " + heightInFeet);


    }
}
