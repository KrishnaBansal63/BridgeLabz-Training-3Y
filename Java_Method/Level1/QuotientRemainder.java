
import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int n, int d) {
        return new int[]{n % d, n / d};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rq = findRemainderAndQuotient(sc.nextInt(), sc.nextInt());
        System.out.println("Remainder: " + rq[0] + ", Quotient: " + rq[1]);
    }
}
