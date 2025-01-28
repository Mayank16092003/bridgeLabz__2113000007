package Day5_27_01_2025.Level2;

import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = quadratic(a, b, c);

        if (roots == null) {
            System.out.println("Roots are complex. Returning null.");
        } else {
            System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
        }

        sc.close();
    }

    public static double[] quadratic(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return null;
        }

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }
}
