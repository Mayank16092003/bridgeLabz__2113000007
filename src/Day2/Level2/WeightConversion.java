package Day2.Level2;
import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter wight in pounds");
        float pounds = sc.nextFloat();
        float weightInKg=2.2f*pounds;
        System.out.println("The weight of the person in pound is"+pounds+"and in kgs"+weightInKg);
    }
}
