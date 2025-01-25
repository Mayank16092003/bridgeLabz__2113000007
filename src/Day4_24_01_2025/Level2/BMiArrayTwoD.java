package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class BMiArrayTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();
            personData[i][0] = height;
            System.out.print("Enter weight in kilograms: ");
            double weight = sc.nextDouble();
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("height "+personData[i][0]+"Weight "+personData[i][1]+"BMI "+personData[i][2]+"Weight status "+weightStatus[i]);
        }
    }
}
