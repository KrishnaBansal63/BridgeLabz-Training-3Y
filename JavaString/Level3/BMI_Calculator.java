
import java.util.*;

public class BMI_Calculator {
    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    static String[][] computeBMI(double[][] hw) {
        int n = hw.length;
        String[][] out = new String[n][4];
        for (int i = 0; i < n; i++) {
            double wt = hw[i][0];
            double htCm = hw[i][1];
            double htM = htCm / 100.0;
            double bmi = wt / (htM * htM);
            out[i][0] = String.format("%.0f", htCm);
            out[i][1] = String.format("%.1f", wt);
            out[i][2] = String.format("%.1f", bmi);
            out[i][3] = status(bmi);
        }
        return out;
    }

    static void display(String[][] rows) {
        System.out.printf("%-6s %-7s %-6s %-12s%n", "Ht(cm)", "Wt(kg)", "BMI", "Status");
        System.out.println("-------------------------------------");
        for (String[] r : rows) {
            System.out.printf("%-6s %-7s %-6s %-12s%n", r[0], r[1], r[2], r[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height(cm): ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] table = computeBMI(hw);
        display(table);
    }
}
