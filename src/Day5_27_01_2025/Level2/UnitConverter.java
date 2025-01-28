package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class UnitConverter{
    public static double yardsToFeet(double yards){
        double feet = 3*yards;
        return feet;
    }
    public static double feetToYards(double feet){
        double yards=feet*0.333333333;
        return yards;
    }
    public static double metersToInches(double meter) {
        double inches = meter * 39.3701;
        return inches;
    }
    public static double inchesToMeters(double inches){
        double meters=inches*0.0254;
        return meters;
    }
    public static double inchesToCentiMeters(double inches){
        double Centimeters=inches*2.54;
        return Centimeters;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter distance in yards to convert it into feet");
        double yards = ip.nextDouble();
        System.out.println("distance "+yards+" yards in feet is "+yardsToFeet(yards));
        System.out.print("Enter distance in feet to convert it into yards ");
        double feet=ip.nextDouble();
        System.out.println("distance "+feet+"miles in yards is "+feetToYards(feet));
        System.out.print("Enter distance in meter to convert it into inches");
        double meter=ip.nextDouble();
        System.out.println("distance "+meter+" meter in inches is "+metersToInches(meter));
        System.out.print("Enter distance in inches to convert it into meter ");
        double inches=ip.nextDouble();
        System.out.println("distance "+meter+" feet in meter is "+inchesToMeters(inches));
        System.out.println("distance "+meter+" feet in centi meter is "+inchesToCentiMeters(inches));
    }
}
