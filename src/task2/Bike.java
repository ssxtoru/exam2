package task2;

public class Bike extends Vehicle{
    private Integer volumeOfEngine;
    private String typeOfBike;

    public Bike(Integer year, String make, String typeOfBike, Integer volumeOfEngine) {
        super(year, make);
        this.typeOfBike = typeOfBike;
        this.volumeOfEngine = volumeOfEngine;
    }

    @Override
    public void start() {
        System.out.println("Bike have been started");
    }

    @Override
    public void stop() {
        System.out.println("Bike have been stopped");
    }

    public String toString(){
        return "Bike has been made in: " + getYear() +
                " \nName of the model: " + getMake() +
                " \nBike has " + volumeOfEngine + " liter engine " +
                " \nThe type of bike is : " + typeOfBike;
    }
}
