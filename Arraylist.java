import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int sum = 0;
        int product = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

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

        scanner.close();
    }
}
