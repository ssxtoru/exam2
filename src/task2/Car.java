package task2;

public class Car extends Vehicle {

    private Integer amountOfSeats;
    private String typeOfEngine;

    public Car(Integer year, String make, Integer amountOfSeats, String typeOfEngine) {
        super(year, make);
        this.amountOfSeats = amountOfSeats;
        this.typeOfEngine = typeOfEngine;

    }

    @Override
    public void start() {
        System.out.println("Car have been started");
    }

    @Override
    public void stop() {
        System.out.println("Car have been stopped");
    }

    @Override
    public String toString() {
        return "Car has been made in: " + getYear() +
                " \nName of the model: " + getMake() +
                " \nCar has " + amountOfSeats + " seats " +
                " \nType of engine is: " + typeOfEngine;
    }
}
