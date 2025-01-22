package Day2.Level2;
import java.util.Scanner;
public class AthleteDistanceRounds {
    public static void main(String[] args){
        System.out.println("Enter side of triangular park: ");
        Scanner input = new Scanner(System.in);
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();
        int perimeter=side1+side2+side3;
        int distance=5;
        int round =perimeter/distance;
        System.out.println("total rounds of athlete are "+round);
    }
}
