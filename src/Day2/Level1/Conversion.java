package Day2.Level1;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km=input.nextInt();
        System.out.println("distance in km "+km);
        float distanceInMiles=km/1.6f;
        System.out.println("The distance in Miles is "+distanceInMiles);
    }
}
