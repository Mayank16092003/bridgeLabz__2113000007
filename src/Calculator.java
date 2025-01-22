package Day2.Level1;
    import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int number1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            int difference = number1 - number2;
            int multiplication = number1 * number2;
            int division = number1 / number2;
            System.out.println("The addition, subtraction,multiplication and division of tum numbers "+number1+" and "+number2+" is "+sum+" "+difference+" "+multiplication+" and "+division+" respectively");


        }
    }

