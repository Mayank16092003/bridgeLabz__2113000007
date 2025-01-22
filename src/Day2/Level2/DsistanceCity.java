package Day2.Level2;
import java.util.Scanner;
public class DsistanceCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your name, toCity , vis city and from city ");
        String name = input.nextLine();
        String toCity = input.nextLine();
        String viaCity = input.nextLine();
        String fromCity = input.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " miles and "+"the Total Time taken is " + totalTime + " minutes.");


    }
}
