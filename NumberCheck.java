import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        // Check each number
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        
        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than last number.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
    }
}
