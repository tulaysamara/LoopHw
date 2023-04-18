import java.util.ArrayList;
import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			int num = input.nextInt();
			numbers.add(num);
		}

		int sum = 0;
		int product = 1;
		int largest = numbers.get(0);
		int smallest = numbers.get(0);

		for (int num : numbers) {
			sum += num;
			product *= num;
			if (num > largest) {
				largest = num;
			}
			if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);

	}

}
