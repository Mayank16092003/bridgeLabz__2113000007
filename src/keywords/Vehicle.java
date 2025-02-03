package keywords;
public class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("shivam", "9870", "Car");
        Vehicle vehicle2 = new Vehicle("prince", "9876", "Scooty");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }

        Vehicle.updateRegistrationFee(150.0);

        System.out.println("\nAfter updating registration fee:");
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }
    }
}