package Day2.Level1;


import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base,height;
        System.out.print("Enter the base in cm: ");
        base = input.nextFloat();
        System.out.print("Enter the height in cm: ");
        height= input.nextFloat();
        float area=base*height/2f;
        System.out.println("The area of the triangle in cm sq is "+area);
        float areaInInches=area/(2.54f*2.54f);
        System.out.println("The area of the triangle in inch square is "+areaInInches);

    }
}

