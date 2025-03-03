import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number < 1) {
            System.out.println("Error: Enter a natural number greater than 0.");
            scanner.close();
            return;
        }
        
        // Define arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        
        // Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        scanner.close();
        
        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        // Print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
