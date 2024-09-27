// Vehicle.java
interface Vehicle {
    void start();
    void stop();
    
    default void honk() {
        System.out.println("Honk!");
    }
}

// Car.java
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Bike.java
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
    
}


// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Test Car
        car.start();
        car.honk();  // Calls the default honk() method from Vehicle interface
        car.stop();

        // Test Bike
        bike.start();
        bike.honk();  // Calls the default honk() method from Vehicle interface
        bike.stop();
    }
}

