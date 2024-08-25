import java.util.Scanner;
//main class --> customer and vehicle details
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);
        System.out.println("Enter vehicle type (1 for Car, 2 for Bike):");
        int vehicleType = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter vehicle license plate:");
        String licensePlate = scanner.nextLine();
        Vehicle vehicle;
        if (vehicleType == 1) {
            vehicle = new Car(licensePlate);
        } else {
            vehicle = new Bike(licensePlate);
        }
        System.out.println("Enter number of days for rental:");
        int rentalDays = scanner.nextInt();
        Rental rental = new Rental(vehicle, customer, rentalDays);
        rental.displayRentalInfo();
        scanner.close();
    }
}