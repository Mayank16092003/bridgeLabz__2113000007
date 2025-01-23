package Day3_23_01_2025.Level1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter day");
        int day=ip.nextInt();
        System.out.println("Enter month");
        int month=ip.nextInt();
        if(month==3&&day>=20&&day<=31)
            System.out.println("Its Spring");
        else if(month==4&&day>=1&&day<=30)
            System.out.println("Its Spring");
        else if(month==5&&day>=1&&day<=31)
            System.out.println("Its Spring");
        else if(month==6&&day>=1&&day<=20)
            System.out.println("Its Spring");
        else
            System.out.println("Not a Spring Season");
    }
}
