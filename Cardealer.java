import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a hash map of vehicles (model as key, make as value)
        Map<String, String> vehicles = new HashMap<>();
        vehicles.put("Civic", "Honda");
        vehicles.put("Corolla", "Toyota");
        vehicles.put("Accord", "Honda");
        vehicles.put("Camry", "Toyota");
        vehicles.put("F-150", "Ford");

        System.out.println("Welcome to the Car Dealer!");
        System.out.print("What car model are you looking for? ");
        String model = scanner.nextLine();

        if (vehicles.containsKey(model)) {
            String make = vehicles.get(model);
            System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
        } else {
            System.out.println("Sorry, we don't have that model in stock.");
        }

        scanner.close();
    }
}
