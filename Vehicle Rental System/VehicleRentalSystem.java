import java.util.Scanner;
// Main class --> customer and vehicle details --> exception for licence plate number and invalid vehicle type
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter customer name:");
            String customerName = scanner.nextLine();
            Customer customer = new Customer(customerName);
            System.out.println("Enter vehicle type");
            System.out.println("1. Car ($50 per day)");
            System.out.println("2. Bike ($20 per day)");
            int vehicleType = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter vehicle license plate (10 characters long):");
            String licensePlate = scanner.nextLine();
            if (licensePlate.length() != 10) {
                throw new IllegalArgumentException("License plate must be exactly 10 characters long.");
            }
            Vehicle vehicle;
            if (vehicleType == 1) {
                vehicle = new Car(licensePlate);
            } else if (vehicleType == 2) {
                vehicle = new Bike(licensePlate);
            } else {
                throw new IllegalArgumentException("Invalid vehicle type selected.");
            }
            System.out.println("Enter number of days for rental:");
            int rentalDays = scanner.nextInt();
            Rental rental = new Rental(vehicle, customer, rentalDays);
            rental.displayRentalInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}