package Day4_24_01_2025.Level2;
import java.util.Scanner;

public class AgeAndHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names ={"Amar","Akbar","Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];
        System.out.println("Enter ages of all three:");
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
        }
        System.out.println("Enter heights of all three:");
        for (int i = 0; i < 3; i++) {
            height[i] = sc.nextInt();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("The youngest is " + names[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest is " + names[tallestIndex] + " with height " + height[tallestIndex]);
    }
}
