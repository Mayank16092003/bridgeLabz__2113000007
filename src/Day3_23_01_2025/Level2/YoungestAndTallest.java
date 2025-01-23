package Day3_23_01_2025.Level2;
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter age and height of Amar,Akbar and Anthony: ");
        int ageAmar = ip.nextInt();
        double heightAmar = ip.nextDouble();
        int ageAkbar = ip.nextInt();
        double heightAkbar = ip.nextDouble();
        int ageAnthony = ip.nextInt();
        double heightAnthony = ip.nextDouble();
        if(ageAmar<ageAkbar&&ageAmar<ageAnthony)
            System.out.println("Amar is youngest with age "+ageAmar);
        else if(ageAkbar<ageAmar&&ageAkbar<ageAnthony)
            System.out.println("akbar is youngest with age "+ageAkbar);
        else
            System.out.println("anathony is youngest with age "+ageAnthony);
        if(heightAmar>heightAkbar&&heightAmar>heightAnthony)
            System.out.println("Amar is tallest with heiht "+heightAmar);
        else if(heightAkbar>heightAmar&&heightAkbar>heightAnthony)
            System.out.println("akbar is tallest with height "+heightAkbar);
        else
            System.out.println("anathony is tallest with height "+heightAnthony);
    }
}