package vehicles;

public class HybridV extends Vehicle {

    public HybridV(Car car, Engine engine, Manufacture manufacture) {
        super(car, engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("HybridV Characteristics:");
        System.out.println(getCar().toString());
        System.out.println("Engine Type: " + getEngine().getEngineType());
        System.out.println("Manufacture: " + getManufacture());
    }
}
