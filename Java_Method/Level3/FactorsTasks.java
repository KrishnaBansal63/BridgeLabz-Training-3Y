
import java.util.*;

public class FactorsTasks {
    public static int[] factors(int n) {
        n = Math.abs(n);
        if (n == 0) return new int[]{ };
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] a = new int[count];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) a[k++] = i;
        return a;
    }
    public static int greatestFactor(int[] f) { return f.length == 0 ? -1 : f[f.length - 1]; }
    public static long sum(int[] f) { long s = 0; for (int x : f) s += x; return s; }
    public static long product(int[] f) { long p = 1; for (int x : f) p *= x; return p; }
    public static long productCubes(int[] f) { long p = 1; for (int x : f) p *= (long)Math.pow(x, 3); return p; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest Factor: " + greatestFactor(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of Cubes: " + productCubes(f));
    }
}
