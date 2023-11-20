package task2;

public class Bus extends Vehicle{
    private Integer numberOfBus;
    private Integer numberOfGears;

    public Bus(Integer year, String make, Integer numberOfBus, Integer numberOfGears) {
        super(year, make);
        this.numberOfBus = numberOfBus;
        this.numberOfGears = numberOfGears;
    }


    @Override
    public void start() {
        System.out.println("Bus have been started");

    }

    @Override
    public void stop() {
        System.out.println("Bus have been stopped");

    }

    @Override
    public String toString() {
        return "Bus has been made in: " + getYear() +
                " \nName of the model: " + getMake() +
                " \nThe Bus's number is: " + numberOfBus +
                " \nBus has " + numberOfGears + " gears";
    }
}
