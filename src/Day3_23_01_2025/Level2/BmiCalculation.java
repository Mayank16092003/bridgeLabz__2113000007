package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class BmiCalculation {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter weight in kg: ");
            double weight = ip.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightInCm = ip.nextDouble();
            double heightInM = heightInCm / 100;
            double bmi = weight / (heightInM * heightInM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            System.out.println("Your BMI is:"+bmi);
            System.out.println("Weight Status: "+status);
        }
    }

