
import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] trig = calculateTrigonometricFunctions(sc.nextDouble());
        System.out.println("Sin: " + trig[0] + ", Cos: " + trig[1] + ", Tan: " + trig[2]);
    }
}
