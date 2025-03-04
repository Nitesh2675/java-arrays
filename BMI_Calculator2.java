import java.util.Scanner;

public class BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        
        double[][] personData = new double[n][3]; // Stores height, weight, and BMI
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // Calculate BMI
            
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
    
        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        scanner.close();
    }
}
