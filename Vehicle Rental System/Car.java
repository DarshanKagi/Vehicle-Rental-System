//car class --> child class of vehile --> constructor for car and calculate rental for car
class Car extends Vehicle {
    Car(String licensePlate) {
        super(licensePlate);
    }
    double calculateRentalCost(int days) {
        return days * 50;
    }
}