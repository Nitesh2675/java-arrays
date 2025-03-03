import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Define an array to store multiplication results
        int[] table = new int[10];
        
        // Populate the array with multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        
        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}