package Day5_27_01_2025.Level2;
import java.util.Scanner;
public class UnitConverter_2 {

        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double convertPoundsToKilograms(double pounds) {
            return pounds * 0.453592;
        }
        public static double convertKilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }
        public static double convertGallonsToLiters(double gallons) {
            return gallons * 3.78541;
        }
        public static double convertLitersToGallons(double liters) {
            return liters * 0.264172;
        }
        public static void main(String[] args) {
            Scanner ip=new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit=ip.nextDouble();
            System.out.println("Enter temperature in Celsius: ");
            double celsius=ip.nextDouble();
            System.out.println("Enter weight in Pounds: ");
            double pounds=ip.nextDouble();
            System.out.println("Enter weight in Kilograms: ");
            double kg=ip.nextDouble();
            System.out.println("Enter volume in Gallons: ");
            double gallons=ip.nextDouble();
            System.out.println("Enter volume in Liters: ");
            double liters=ip.nextDouble();
            System.out.println(fahrenheit +"F to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
            System.out.println(celsius +"C to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
            System.out.println(pounds +"pounds to kilograms: " + convertPoundsToKilograms(pounds));
            System.out.println(kg +"kilograms to pounds: " + convertKilogramsToPounds(kg));
            System.out.println(gallons +"gallon to liters: " + convertGallonsToLiters(gallons));
            System.out.println(liters +"liter to gallons: " + convertLitersToGallons(liters));
        }
    }

