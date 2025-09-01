
import java.util.*;

public class StudentScorecard {
    public static int[][] generatePCM(int n) {
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) a[i][j] = (int)(Math.random() * 100);
        }
        return a;
    }
    public static double[][] totals(int[][] pcm) {
        int n = pcm.length;
        double[][] out = new double[n][3]; // total, avg, percent
        for (int i = 0; i < n; i++) {
            int t = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = t / 3.0;
            double pct = (t / 300.0) * 100.0;
            out[i][0] = Math.round(t * 100.0) / 100.0;
            out[i][1] = Math.round(avg * 100.0) / 100.0;
            out[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return out;
    }
    public static void display(int[][] pcm, double[][] res) {
        System.out.println("Idx	Phy	Chem	Math	Total	Avg	%	");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("%d	%d	%d	%d	%.2f	%.2f	%.2f%n",
                i+1, pcm[i][0], pcm[i][1], pcm[i][2], res[i][0], res[i][1], res[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pcm = generatePCM(n);
        double[][] res = totals(pcm);
        display(pcm, res);
    }
}
