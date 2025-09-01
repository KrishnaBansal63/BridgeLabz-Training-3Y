
import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        return 5000 / (a + b + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rounds: " + calculateRounds(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
