package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class UnitConverter_1 {
    public static double kmToMiles(double km){
        double miles = 0.621371*km;
        return miles;
    }
    public static double milesToKm(double miles){
        double km=miles*1.60934;
        return km;
    }
    public static double metersToFeet(double meter) {
        double feet = meter * 3.2808;
        return feet;
    }
    public static double feetToMeters(double feet){
        double meters=feet*0.3048;
        return meters;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter distance in km to convert it into miles ");
        double km = ip.nextDouble();
        System.out.println("distance "+km+" km in miles is "+kmToMiles(km));
        System.out.print("Enter distance in miles to convert it into km ");
        double miles=ip.nextDouble();
        System.out.println("distance "+miles+"miles in km is "+milesToKm(miles));
        System.out.print("Enter distance in meter to convert it into feet ");
        double meter=ip.nextDouble();
        System.out.println("distance "+meter+" meter in km is "+metersToFeet(meter));
        System.out.print("Enter distance in km to feet it into meter ");
        double feet=ip.nextDouble();
        System.out.println("distance "+meter+" feet in meter is "+feetToMeters(feet));
    }
}
