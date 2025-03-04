import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] frequency = new int[10]; // Array to store the frequency of digits (0-9)

        // Processing each digit
        int temp = Math.abs(number); // Handling negative numbers
        while (temp > 0) {
            int digit = temp % 10;  // Extract the last digit
            frequency[digit]++;     // Increment frequency count
            temp /= 10;             // Remove last digit
        }

        // Displaying frequency of each digit
        System.out.println("Digit Frequency in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        scanner.close();
    }
}
