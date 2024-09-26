package vehicles;

public abstract class Vehicle {
	
    private Car car;
    private Engine engine;
    private Manufacture manufacture;

    public Vehicle(Car car, Engine engine, Manufacture manufacture) {
        this.car = car;
        this.engine = engine;
        this.manufacture = manufacture;
    }

    public Car getCar() {
        return car;
    }

    public Engine getEngine() {
        return engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    // Abstract method to be implemented by subclasses
    public abstract void ShowCharacteristics();

}
