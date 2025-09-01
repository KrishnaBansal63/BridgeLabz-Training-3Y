
import java.util.Scanner;

public class DistributeChocolates {
    public static int[] distributeChocolates(int choco, int kids) {
        return new int[]{choco % kids, choco / kids};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dc = distributeChocolates(sc.nextInt(), sc.nextInt());
        System.out.println("Each gets: " + dc[1] + ", Remaining: " + dc[0]);
    }
}
