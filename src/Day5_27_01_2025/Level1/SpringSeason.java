package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class SpringSeason {
    public boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31)
            return true;
        else if (month == 4 && day >= 1 && day <= 30)
            return true;
        else if (month == 5 && day >= 1 && day <= 31)
            return true;
        else if (month == 6 && day >= 1 && day <= 20)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        SpringSeason is=new SpringSeason();
        System.out.println("Enter day");
        int day = ip.nextInt();
        System.out.println("Enter month");
        int month = ip.nextInt();
        if(is.isSpring(month,day))
            System.out.println("Its Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}