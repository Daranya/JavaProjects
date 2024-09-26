package vehicles;

public class ICEV extends Vehicle {

    public ICEV(Car car, Engine engine, Manufacture manufacture) {
        super(car, engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("ICEV Characteristics:");
        System.out.println(getCar().toString());
        System.out.println("Engine Type: " + getEngine().getEngineType());
        System.out.println("Manufacture: " + getManufacture());
    }
}
