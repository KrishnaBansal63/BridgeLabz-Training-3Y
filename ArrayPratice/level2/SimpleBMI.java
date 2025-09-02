
import java.util.Scanner;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);
            String status;

            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal weight";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            System.out.printf("BMI: %.2f | Status: %s\n", bmi, status);
        }

        sc.close();
    }
}

