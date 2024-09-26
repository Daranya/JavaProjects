package vehicles;

public class CarManager {

    public static void main(String[] args) {
        // Create Manufacture instances
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        // Create Engine instances
        Engine combustionEngine = new CombustionEngine();
        Engine electricEngine = new ElectricEngine();
        Engine hybridEngine = new HybridEngine();

        // Create Car instances
        Car toyotaCar = new Car(1, "Toyota", "Corolla", 2020, "White", 20000.0, "ABC123");
        Car teslaCar = new Car(2, "Tesla", "Model S", 2021, "Red", 80000.0, "DEF456");
        Car fordCar = new Car(3, "Ford", "Fusion Hybrid", 2019, "Blue", 30000.0, "GHI789");

        // Create an array of Vehicle objects and populate it
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new ICEV(toyotaCar, combustionEngine, toyota); // ICEV
        vehicles[1] = new BEV(teslaCar, electricEngine, tesla);      // BEV
        vehicles[2] = new HybridV(fordCar, hybridEngine, ford);      // HybridV

        // Display characteristics of each vehicle
        System.out.println("Vehicle Characteristics");
        System.out.println("=======================");
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println(); // Print a blank line between vehicle details
        }
    }
}
