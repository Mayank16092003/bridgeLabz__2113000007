package Day4_24_01_2025.Level2;
import java.util.Scanner;
public class Bonus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //final int EMP_COUNT = 10;
        double[][] employee = new double[10][2];
        double[][] result = new double[10][2];
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + " ");
            double salary = -1;
            double yearsOfService = -1;
            while (true) {
                System.out.print("Enter salary (must be > 0): ");
                if (scanner.hasNextDouble()) {
                    salary = scanner.nextDouble();
                    if (salary > 0) {
                        break;
                    } else {
                        System.out.println("invalid Please try again.");
                    }
                } else {
                    System.out.println("Invalid Please enter a numeric value.");
                    scanner.next();
                }
            }
            while (true) {
                System.out.print("Enter years of service (must be >= 0): ");
                if (scanner.hasNextDouble()) {
                    yearsOfService = scanner.nextDouble();
                    if (yearsOfService >= 0) {
                        break;
                    } else {
                        System.out.println(" Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter again");
                    scanner.next();
                }
            }
            employee[i][0] = salary;
            employee[i][1] = yearsOfService;
        }
        for (int i = 0; i < 10; i++) {
            double salary = employee[i][0];
            double yearsOfService = employee[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = 0.05 * salary;
            } else {
                bonus = 0.02 * salary;
            }
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + employee[i][0]);
            System.out.println("  Years of Service: " + employee[i][1]);
            System.out.println("  Bonus: " + result[i][0]);
            System.out.println("  New Salary: " + result[i][1]);
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

