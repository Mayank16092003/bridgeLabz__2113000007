package bl_classandobject;
import java.util.Scanner;
public class Employee {
    String name;
    int id;
    int salary;
    public Employee(int id, int salary, String name) {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    public  void display(int id, int salary, String name) {
        System.out.println("person with name "+name+" and id "+id+" has salary "+salary);
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the id, salary and name of the employee");
        int id=ip.nextInt();
        int salary=ip.nextInt();
        String name=ip.next();
        Employee e=new Employee(id,salary,name);
        e.display(id,salary,name);
    }
}
