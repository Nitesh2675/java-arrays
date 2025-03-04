import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        double[][] marks = new double[n][3]; // Stores marks for Physics, Chemistry, Maths
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextDouble();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Enter again.");
                    }
                } while (marks[i][j] < 0);
            }
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3; // Calculate percentage
            
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f%%\t%s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        scanner.close();
    }
}
