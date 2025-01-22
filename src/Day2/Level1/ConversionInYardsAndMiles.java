package Day2.Level1;
import java.util.Scanner;
public class ConversionInYardsAndMiles {
    public static void main(String[] args) {
        System.out.println("Enter the number of feet you would like to convert");
        Scanner input= new Scanner(System.in);
        int feet= input.nextInt();
        float yards=feet/3f;
        float mile=yards/1760;
        System.out.println("distance in yards is "+yards+" distancce in miles is "+mile);

    }
}
