
import java.util.*;

public class PalindromeCheck {
    static boolean isPalindromeIter(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    static boolean isPalindromeRec(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRec(s, i + 1, j - 1);
    }

    static char[] reverseWithCharAt(String s) {
        int n = s.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) rev[i] = s.charAt(n - 1 - i);
        return rev;
    }
    static boolean isPalindromeArrays(String s) {
        char[] a = s.toCharArray();
        char[] b = reverseWithCharAt(s);
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Iterative  : " + isPalindromeIter(text));
        System.out.println("Recursive  : " + isPalindromeRec(text, 0, text.length()-1));
        System.out.println("By Arrays  : " + isPalindromeArrays(text));
    }
}

