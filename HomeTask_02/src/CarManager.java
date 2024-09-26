import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class CarManager {
	
    public static void main(String[] args) {
        // Creating an array of Car objects
        Car[] cars = new Car[5];  // Random array size

        // Adding some sample Car objects to the array
        cars[0] = new Car(1, "Toyota", "Camry", 2015, "White", 15000, "ABC123");
        cars[1] = new Car(2, "Honda", "Civic", 2010, "Black", 12000, "XYZ789");
        cars[2] = new Car(3, "Ford", "Mustang", 2018, "Red", 30000, "DEF456");
        cars[3] = new Car(4, "Toyota", "Corolla", 2008, "Blue", 9000, "GHI234");
        cars[4] = new Car(5, "Honda", "Accord", 2020, "Silver", 25000, "JKL567");

        // Call the methods to filter and save the lists
        saveCarsByMake(cars, "Toyota");
        saveCarsByModelAndYears(cars, "Civic", 5);
        saveCarsByYearAndPrice(cars, 2015, 10000);
    }

    // Method a: Save cars of a given brand
    public static void saveCarsByMake(Car[] cars, String make) {
        try (PrintWriter writer = new PrintWriter("cars_by_make.txt")) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(make)) {
                    writer.println(car);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method b: Save cars of a given model that have been in use for more than n years
    public static void saveCarsByModelAndYears(Car[] cars, String model, int years) {
        int currentYear = java.time.Year.now().getValue();
        try (PrintWriter writer = new PrintWriter("cars_by_model_and_years.txt")) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture()) > years) {
                    writer.println(car);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method c: Save cars of a given year of manufacture with a price higher than a specified amount
    public static void saveCarsByYearAndPrice(Car[] cars, int year, double price) {
        try (PrintWriter writer = new PrintWriter("cars_by_year_and_price.txt")) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == year && car.getPrice() > price) {
                    writer.println(car);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
