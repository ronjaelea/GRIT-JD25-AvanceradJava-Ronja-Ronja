public class AbstractDemo {

    public static void Demo() {
        Vehicle miniCar = new Car();
        Car tesla = new Car();

        miniCar.start();
        miniCar.move();

        tesla.start();
        tesla.move();
    }

}


abstract class Vehicle {

    abstract void move();

    void start() {
        System.out.println("Engine started");
    }
}


class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}