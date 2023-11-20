package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Car car = new Car(2015, "BMW M5 f10", 4, "V8 twinturbo");
        Bike bike = new Bike(2022, "Ducati", "sports bike", 1);
        Bus bus = new Bus(2018, "Sprinter", 10, 15);

        System.out.println();
        System.out.println("---------------------------------------");
        car.start();
        System.out.println();
        System.out.println(car);
        System.out.println();
        car.stop();
        System.out.println("---------------------------------------");
        System.out.println();

        bike.start();
        System.out.println();
        System.out.println(bike);
        System.out.println();
        bike.stop();
        System.out.println("---------------------------------------");
        System.out.println();

        bus.start();
        System.out.println();
        System.out.println(bus);
        System.out.println();
        bus.stop();
    }
}
