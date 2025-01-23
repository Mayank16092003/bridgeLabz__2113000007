package Day3_23_01_2025.Level1;

import java.util.Scanner;

public class CanVote {
    public static void main(String [] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter age of a person");
        int age=ip.nextInt();
        if(age>=18)
            System.out.println("The person's age is "+age+" and can vote.");
        else
            System.out.println("The person's age is "+age+" and cannot vote.");
    }
}
