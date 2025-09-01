
import java.util.*;

public class NumberCheckerB {
    public static int countDigits(long n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }
    public static int[] toDigits(long n) {
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) { d[i] = (int)(n % 10); n /= 10; }
        return d;
    }
    public static int sumDigits(int[] d) {
        int s = 0; for (int x : d) s += x; return s;
    }
    public static int sumSquares(int[] d) {
        int s = 0; for (int x : d) s += (int)Math.pow(x, 2); return s;
    }
    public static boolean isHarshad(long n) {
        int[] d = toDigits(n);
        int s = sumDigits(d);
        if (s == 0) return false;
        return Math.abs(n) % s == 0;
    }
    public static int[][] digitFrequency(long n) {
        int[] freq = new int[10];
        int[] d = toDigits(n);
        for (int x : d) freq[x]++;
        int[][] table = new int[10][2];
        for (int i = 0; i < 10; i++) { table[i][0] = i; table[i][1] = freq[i]; }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] d = toDigits(n);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Sum: " + sumDigits(d));
        System.out.println("SumSquares: " + sumSquares(d));
        System.out.println("Harshad: " + isHarshad(n));
        int[][] table = digitFrequency(n);
        System.out.println("Digit Frequency [digit, count]:");
        for (int i = 0; i < table.length; i++) System.out.println(Arrays.toString(table[i]));
    }
}
