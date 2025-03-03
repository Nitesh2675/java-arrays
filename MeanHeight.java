import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to store heights
        double[] heights = new double[11];
        double sum = 0.0;
        
        // Get user input for heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        scanner.close();
        
        // Calculate mean height
        double meanHeight = sum / 11;
        
        // Display the mean height
        System.out.println("Mean height of the football team: " + meanHeight);
    }
}