package keywords;
public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public static void main(String[] args) {
        Student.displayTotalStudents();

        Student student1 = new Student("archi", "234", "A");
        Student student2 = new Student("khushi", "654", "C");

        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }

        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }
        if (student1 instanceof Student) {
            student1.updateGrade("A+");
            System.out.println("Updated details for student1:");
            student1.displayStudentDetails();
        }

        Student.displayTotalStudents();
    }
}