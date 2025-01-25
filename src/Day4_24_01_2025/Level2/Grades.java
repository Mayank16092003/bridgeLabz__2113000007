package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfSt = sc.nextInt();
        int[] physicsM = new int[numOfSt];
        int[] chemistryM= new int[numOfSt];
        int[] mathsM = new int[numOfSt];
        double[] percentages = new double[numOfSt];
        String[] grades = new String[numOfSt];
        for (int i = 0; i < numOfSt; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Enter marks for Physics: ");
            physicsM[i] = sc.nextInt();
            while (physicsM[i] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Physics: ");
                physicsM[i] = sc.nextInt();
            }
            System.out.print("Enter marks for Chemistry: ");
            chemistryM[i] = sc.nextInt();
            while (chemistryM[i] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Chemistry: ");
                chemistryM[i] = sc.nextInt();
            }
            System.out.print("Enter marks for Maths: ");
            mathsM[i] = sc.nextInt();
            while (mathsM[i] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Maths: ");
                mathsM[i] = sc.nextInt();
            }
            double totalMarks = physicsM[i] + chemistryM[i] + mathsM[i];
            percentages[i] = (totalMarks / 300) * 100;
            if (percentages[i] >= 80) {
                grades[i] = "Level 4 above agency normalized students";
            } else if (percentages[i] >= 70 && percentages[i] <= 79) {
                grades[i] = "Level 3 at agency normalized students";
            } else if (percentages[i] >= 60 && percentages[i] <= 69) {
                grades[i] = "Level 2 at agency normalized students";

            }
            else if (percentages[i] >= 50 && percentages[i] <= 59) {
                    grades[i] = "Level 1 well below  agency normalized students";}
            else if (percentages[i] >= 40 && percentages[i] <= 49) {
                grades[i] = "Level 1- too below  agency normalized students";}
            else {
                grades[i] = "Remedial standards";
            }
        }
        for (int i = 0; i < numOfSt; i++) {
            System.out.println("Student " + (i + 1)+" percent "+percentages[i]+" grades"+grades[i]);
        }
    }
}
