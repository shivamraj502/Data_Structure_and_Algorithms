package day0_4;
/**
 * Create Vehicle class: fields speed, capacity; method display().
 * Then create Car extends Vehicle with extra fields brand, model.
 * In main, create Car object and call display() (inherited) plus Car specific methods.
 */

class Vehicle {
    int speed;
    int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Capacity: " + capacity + " persons");
    }
}

class Car extends Vehicle {
    String brand;
    String model;

    public Car(int speed, int capacity, String brand, String model) {
        super(speed, capacity);
        this.brand = brand;
        this.model = model;
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car(199, 5, "BMW", "X5");
        car.display();          // inherited method
        car.showCarDetails();   // car-specific method
    }
}
