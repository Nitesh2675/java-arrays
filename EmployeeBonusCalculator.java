import java.util.Scanner;

public class EmployeeBonusCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;
        
        double[] salaries = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonuses = new double[EMPLOYEES];
        double[] newSalaries = new double[EMPLOYEES];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        for (int i = 0; i < EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                
                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                    i--; // Decrement index to re-enter valid values
                }
            }
        }
        
        for (int i = 0; i < EMPLOYEES; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? (salaries[i] * 0.05) : (salaries[i] * 0.02);
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}
