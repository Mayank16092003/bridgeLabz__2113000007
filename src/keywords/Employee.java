package keywords;
public class Employee {
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
    public static void main(String[] args) {
        Employee.displayTotalEmployees();
        Employee emp1 = new Employee("Alice", "E001", "Software Engineer");
        Employee emp2 = new Employee("Bob", "E002", "Project Manager");
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }
        Employee.displayTotalEmployees();
    }
}