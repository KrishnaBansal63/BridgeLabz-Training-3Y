import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        return new int[]{Math.min(n1, Math.min(n2, n3)), Math.max(n1, Math.max(n2, n3))};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sl = findSmallestAndLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Smallest: " + sl[0] + ", Largest: " + sl[1]);
    }
}
