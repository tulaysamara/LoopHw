import java.util.HashMap;
import java.util.Scanner;

public class cars {

	public static void main(String[] args) {
		HashMap<String, String> cars = new HashMap<>();
		cars.put("Mustang", "Ford");
		cars.put("Silverado", "Chevrolet");
		cars.put("Civic", "Honda");
		cars.put("Corolla", "Toyota");
		cars.put("Accord", "Honda");

		Scanner input = new Scanner(System.in);

		System.out.println("What car model are you looking for? ");
		String model = input.nextLine();

		if (cars.containsKey(model)) {
			String make = cars.get(model);
			System.out.println(
					"Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
		} else {
			System.out.println("Sorry, we don't have that car in our inventory!");
		}

	}

}
