//vehicle class --> parent class --> constructor for licenseplate and calculate rental
class Vehicle {
    String licensePlate;
    Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    double calculateRentalCost(int days) {
        return 0;
    }
}
