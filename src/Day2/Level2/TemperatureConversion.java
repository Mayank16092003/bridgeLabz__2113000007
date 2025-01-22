package Day2.Level2;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the temperature in celsius ");
            float temperatureInC = input.nextFloat();
            float temperatureInF=(temperatureInC*9/5)+32;
            System.out.println("The "+temperatureInC+" celsius is "+temperatureInF+" in fahrenheit");

        }
    }

