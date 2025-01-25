package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int size = sc.nextInt();
        double[] heights = new double[size];
        double[] weights = new double[size];
        double[] bmi = new double[size];
        String[] status = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();
            heights[i] = height;
            System.out.print("Enter weight in kilograms: ");
            double weight = sc.nextDouble();
            weights[i] = weight;
            bmi[i] = weight / (height * height);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        System.out.println("BMI: ");
        for (int i = 0; i < size; i++) {
            System.out.println(heights[i]+" "+weights[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
