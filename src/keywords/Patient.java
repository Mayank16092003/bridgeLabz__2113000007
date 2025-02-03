package keywords;
public class Patient {
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static int getTotalPatients() {
        return totalPatients;
    }
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("908", "Maya", 30, "Fever");
        Patient patient2 = new Patient("987", "Ayan", 45, "Stomach");
        if (patient1 instanceof Patient) {
            patient1.displayPatientDetails();
        }
        if (patient2 instanceof Patient) {
            patient2.displayPatientDetails();
        }
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}