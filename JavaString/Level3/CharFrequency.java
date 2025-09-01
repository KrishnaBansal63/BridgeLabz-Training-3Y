
import java.util.*;

public class CharFrequency {
    static String[][] freqTable(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        int k = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) k++;
        String[][] out = new String[k][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) {
            out[idx][0] = String.valueOf((char)i);
            out[idx][1] = String.valueOf(freq[i]);
            idx++;
        }
        return out;
    }

    static void display(String[][] table) {
        System.out.printf("%-8s %-6s%n", "Char", "Freq");
        System.out.println("----------------");
        for (String[] row : table) System.out.printf("%-8s %-6s%n", row[0], row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] table = freqTable(text);
        display(table);
    }
}

