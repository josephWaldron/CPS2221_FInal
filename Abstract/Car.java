package Final.Abstract;

public class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println("Starting the car engine...");
        // code to start the car engine
    }
}
