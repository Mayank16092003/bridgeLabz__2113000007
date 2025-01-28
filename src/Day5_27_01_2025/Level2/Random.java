package Day5_27_01_2025.Level2;

import java.util.Scanner;

public class Random {
    public int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomArray;
    }
    public double[] findAverageMinMax(int[] numbers) {
        double min = numbers[0];
        double max = numbers[0];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        return new double[]{min, average, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = rand.generate4DigitRandomArray(n);

        System.out.println("The random array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        double[] stats = rand.findAverageMinMax(arr);
        System.out.println("\n\nStatistics:");
        System.out.println("Minimum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
