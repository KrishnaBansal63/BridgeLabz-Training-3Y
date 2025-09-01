
import java.util.*;

public class ZaraBonus {
    public static double[][] generateData(int n) {
        double[][] a = new double[n][2]; // salary, years
        for (int i = 0; i < n; i++) {
            a[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit
            a[i][1] = (int)(Math.random() * 11); // 0..10 years
        }
        return a;
    }
    public static double[][] computeNewSalaryAndBonus(double[][] data) {
        int n = data.length;
        double[][] out = new double[n][2]; // new salary, bonus
        for (int i = 0; i < n; i++) {
            double sal = data[i][0];
            double yrs = data[i][1];
            double rate = (yrs > 5) ? 0.05 : 0.02;
            double bonus = sal * rate;
            out[i][0] = sal + bonus;
            out[i][1] = bonus;
        }
        return out;
    }
    public static void display(double[][] data, double[][] updated) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        System.out.println("Idx	OldSalary	Years	NewSalary	Bonus");
        for (int i = 0; i < data.length; i++) {
            sumOld += data[i][0];
            sumNew += updated[i][0];
            totalBonus += updated[i][1];
            System.out.printf("%d	%.0f		%.0f	%.0f		%.0f%n", i+1, data[i][0], data[i][1], updated[i][0], updated[i][1]);
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Sum Old: %.0f	Sum New: %.0f	Total Bonus: %.0f%n", sumOld, sumNew, totalBonus);
    }
    public static void main(String[] args) {
        double[][] data = generateData(10);
        double[][] updated = computeNewSalaryAndBonus(data);
        display(data, updated);
    }
}
