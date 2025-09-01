
import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int m, int d) {
        return (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isSpringSeason(sc.nextInt(), sc.nextInt()) ? "Its a Spring Season" : "Not a Spring Season");
    }
}
