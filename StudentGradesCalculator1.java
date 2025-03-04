import java.util.Scanner;

public class StudentGradesCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            do {
                System.out.print("Physics marks: ");
                physics[i] = scanner.nextDouble();
                if (physics[i] < 0) System.out.println("Marks cannot be negative. Enter again.");
            } while (physics[i] < 0);
            
            do {
                System.out.print("Chemistry marks: ");
                chemistry[i] = scanner.nextDouble();
                if (chemistry[i] < 0) System.out.println("Marks cannot be negative. Enter again.");
            } while (chemistry[i] < 0);
            
            do {
                System.out.print("Maths marks: ");
                maths[i] = scanner.nextDouble();
                if (maths[i] < 0) System.out.println("Marks cannot be negative. Enter again.");
            } while (maths[i] < 0);
            
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            
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
        
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d | %-7.2f | %-9.2f | %-5.2f | %-10.2f%% | %-5s\n", (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        System.out.println("--------------------------------------------------------------");
        
        scanner.close();
    }
}
