import java.util.*;

public class CharFrequencyNested {
    // Using nested loops with a visited sentinel '0'
    static String[][] frequencyWithNested(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }
        // Count kept characters
        int count = 0;
        for (int i = 0; i < n; i++) if (arr[i] != '0') count++;
        String[][] out = new String[count][2];
        int k = 0;
        for (int i = 0; i < n; i++) if (arr[i] != '0') {
            out[k][0] = String.valueOf(arr[i]);
            out[k][1] = String.valueOf(freq[i]);
            k++;
        }
        return out;
    }

    static void display(String[][] table) {
        System.out.printf("%-8s %-6s%n", "Char", "Freq");
        System.out.println("----------------");
        for (String[] r : table) System.out.printf("%-8s %-6s%n", r[0], r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        display(frequencyWithNested(text));
    }
}
