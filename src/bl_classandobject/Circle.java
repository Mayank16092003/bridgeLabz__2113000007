package D_30_01_2025;
import java.util.Scanner;
public class Circle {
    double radius;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle");
        double r = sc.nextDouble();
        Circle c=new Circle(r);
        System.out.println("area of circle is "+c.area(r));
        System.out.println("circumference of circle is "+c.circumference(r));
    }
    public Circle(double r) {
        this.radius=r;
    }
    public double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    public double circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public void display(double q){
        System.out.println(q);
    }

}
