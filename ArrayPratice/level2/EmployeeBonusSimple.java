
import java.util.Scanner;
public class EmployeeBonusSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of Employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service of Employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = (years[i] > 5) ? 0.05 * salary[i] : 0.02 * salary[i];
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTot. Old Salary: " + totalOldSalary);
        System.out.println("Tot. Bonus Payout: " + totalBonus);
        System.out.println("Tot. New Salary: " + totalNewSalary);

        sc.close();
    }
}

