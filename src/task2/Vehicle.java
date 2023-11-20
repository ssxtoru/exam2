package task2;

public abstract class Vehicle {
    public abstract void start();

    public abstract void stop();

    private Integer year;
    private String make;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Vehicle(Integer year, String make) {
        this.year = year;
        this.make = make;
    }

}
