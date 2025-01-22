package Day2.Level2;

import java.util.Scanner;

public class TempInFtoC {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the temperature in fahrenheit ");
                float temperatureInF = input.nextFloat();
                float temperatureInC=(temperatureInF-32)*5/9;
                System.out.println("The "+temperatureInF+" fahrenheit is "+temperatureInC+" in celsius");

            }
        }

