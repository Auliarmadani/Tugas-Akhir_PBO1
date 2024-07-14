import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private String vin; // Vehicle Identification Number

    public Car(String make, String model, String vin) {
        this.make = make;
        this.model = model;
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", VIN: " + vin;
    }
}

public class CarManager {
    private ArrayList<Car> carList;
    private Scanner scanner;

    public CarManager() {
        carList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addCar() {
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car VIN: ");
        String vin = scanner.nextLine();
        
        Car newCar = new Car(make, model, vin);
        carList.add(newCar);
        System.out.println("Car added successfully!");
    }

    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }
        
        System.out.println("Cars in the collection:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n1. Add Car");
            System.out.println("2. Display Cars");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCar();
                    break;
                case 2:
                    displayCars();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        CarManager manager = new CarManager();
        manager.run();
    }
}
