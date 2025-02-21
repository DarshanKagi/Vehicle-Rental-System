//bike class --> child class of vehile --> constructor for bike and calculate rental for bike
class Bike extends Vehicle {
    Bike(String licensePlate) {
        super(licensePlate);
    }
    double calculateRentalCost(int days) {
        return days * 20;
    }
}