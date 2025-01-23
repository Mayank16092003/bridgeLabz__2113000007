package Day3_23_01_2025.Level1;

import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter counter for countdown");
        int counter = ip.nextInt();
        System.out.println("countdown begins ");
        for(int i = counter; i > 0; i--) {
            System.out.println(i);
        }
    }
}
