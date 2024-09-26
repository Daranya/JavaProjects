package vehicles;

public class BEV extends Vehicle {

    public BEV(Car car, Engine engine, Manufacture manufacture) {
        super(car, engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("BEV Characteristics:");
        System.out.println(getCar().toString());
        System.out.println("Engine Type: " + getEngine().getEngineType());
        System.out.println("Manufacture: " + getManufacture());
    }
}
 