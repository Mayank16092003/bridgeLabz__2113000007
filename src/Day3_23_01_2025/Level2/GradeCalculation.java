package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter marks in all three subjects ");
        float physics = ip.nextFloat();
        float chemistry = ip.nextFloat();
        float maths = ip.nextFloat();
        float totalMarks = physics + chemistry + maths;
        float averageMarks = totalMarks / 3;
        float percentage = (totalMarks / 300) * 100;
        String grade,remarks;
        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.println("average marks  " + averageMarks);
        System.out.println("Grade " + grade);
        System.out.println("Remarks " + remarks);
    }
}