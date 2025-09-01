
import java.util.*;

public class NumberProperties {
    public static int[] properDivisors(int n) {
        if (n <= 1) return new int[]{ };
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        int r = (int)Math.sqrt(n);
        for (int i = 2; i <= r; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) list.add(n / i);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) a[i] = list.get(i);
        return a;
    }
    public static boolean isPerfect(int n) {
        int s = 0; for (int x : properDivisors(n)) s += x; return s == n;
    }
    public static boolean isAbundant(int n) {
        int s = 0; for (int x : properDivisors(n)) s += x; return s > n;
    }
    public static boolean isDeficient(int n) {
        int s = 0; for (int x : properDivisors(n)) s += x; return s < n;
    }
    public static long fact(int n) { long f = 1; for (int i = 2; i <= n; i++) f *= i; return f; }
    public static boolean isStrong(int n) {
        int t = Math.abs(n), s = 0;
        while (t > 0) { s += fact(t % 10); t /= 10; }
        return s == Math.abs(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
