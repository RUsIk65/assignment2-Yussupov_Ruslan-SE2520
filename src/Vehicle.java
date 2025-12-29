public abstract class Vehicle {

    protected String brand;
    protected int year;
    protected Driver driver; // composition

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.driver = null;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
