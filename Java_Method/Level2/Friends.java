
import java.util.Scanner;

public class Friends {
    public static int youngest(int[] ages) {
        int min = ages[0], idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < min) { min = ages[i]; idx = i; }
        return idx;
    }
    public static int tallest(int[] heights) {
        int max = heights[0], idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > max) { max = heights[i]; idx = i; }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) { ages[i] = sc.nextInt(); heights[i] = sc.nextInt(); }
        System.out.println("Youngest: " + names[youngest(ages)]);
        System.out.println("Tallest: " + names[tallest(heights)]);
    }
}

