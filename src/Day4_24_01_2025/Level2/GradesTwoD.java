package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class GradesTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();
        int[][] marks = new int[numOfStudents][3];
        double[] percentages = new double[numOfStudents];
        String[] grades = new String[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Enter marks for Physics: ");
            marks[i][0] = sc.nextInt();
            while (marks[i][0] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Physics: ");
                marks[i][0] = sc.nextInt();
            }
            System.out.print("Enter marks for Chemistry: ");
            marks[i][1] = sc.nextInt();
            while (marks[i][1] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Chemistry: ");
                marks[i][1] = sc.nextInt();
            }
            System.out.print("Enter marks for Maths: ");
            marks[i][2] = sc.nextInt();
            while (marks[i][2] < 0) {
                System.out.print("Invalid marks! Enter a positive value for Maths: ");
                marks[i][2] = sc.nextInt();
            }
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            if (percentages[i] >= 80) {
                grades[i] = "Level 4 above agency normalized students";
            } else if (percentages[i] >= 70) {
                grades[i] = "Level 3 at agency normalized students";
            } else if (percentages[i] >= 60) {
                grades[i] = "Level 2 at agency normalized students";
            } else if (percentages[i] >= 50) {
                grades[i] = "Level 1 well below agency normalized students";
            } else if (percentages[i] >= 40) {
                grades[i] = "Level 1- too below agency normalized students";
            } else {
                grades[i] = "Remedial standards";
            }
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }
    }
}
