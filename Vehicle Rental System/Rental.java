//rental class --> constructor and polymorphism --> rental calculate and display
class Rental {
    Vehicle vehicle;
    Customer customer;
    int days;
    Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }
    double calculateTotalCost() {
        return vehicle.calculateRentalCost(days);
    }
    void displayRentalInfo() {
        System.out.println("Rental Information:");
        System.out.println("Customer: " + customer.name);
        System.out.println("Vehicle License Plate: " + vehicle.licensePlate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}