
import java.util.*;

public class NumberCheckerC {
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
    public static int[] reverse(int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) r[i] = a[a.length - 1 - i];
        return r;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(long n) {
        int[] d = toDigits(n);
        int[] r = reverse(d);
        return arraysEqual(d, r);
    }
    public static boolean isDuckNumber(long n) {
        int[] d = toDigits(n);
        for (int x : d) if (x == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] d = toDigits(n);
        int[] r = reverse(d);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed: " + Arrays.toString(r));
        System.out.println("Equal? " + arraysEqual(d, r));
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Duck: " + isDuckNumber(n));
    }
}
