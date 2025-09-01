
import java.util.*;

public class UniqueCharacters {
    static int lengthWithoutLength(String s) {
        int i = 0;
        while (true) {
            try { s.charAt(i); i++; }
            catch (StringIndexOutOfBoundsException e) { return i; }
        }
    }
    static char[] uniqueChars(String s) {
        int n = lengthWithoutLength(s);
        char[] tmp = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) { seen = true; break; }
            }
            if (!seen) tmp[count++] = c;
        }
        char[] res = new char[count];
        for (int i = 0; i < count; i++) res[i] = tmp[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] uniq = uniqueChars(text);
        System.out.println("Unique characters (" + uniq.length + "): " + Arrays.toString(uniq));
    }
}

