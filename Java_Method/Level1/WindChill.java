
import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double t, double w) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wind Chill: " + calculateWindChill(sc.nextDouble(), sc.nextDouble()));
    }
}
