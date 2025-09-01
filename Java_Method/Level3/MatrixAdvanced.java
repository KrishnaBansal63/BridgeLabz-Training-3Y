
import java.util.*;

public class MatrixAdvanced {
    public static double[][] randomMatrix(int r, int c) {
        double[][] a = new double[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = (int)(Math.random() * 10);
        return a;
    }
    public static double[][] transpose(double[][] A) {
        int r = A.length, c = A[0].length;
        double[][] T = new double[c][r];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) T[j][i] = A[i][j];
        return T;
    }
    public static double det2(double[][] M) {
        return M[0][0]*M[1][1] - M[0][1]*M[1][0];
    }
    public static double det3(double[][] M) {
        double a = M[0][0], b = M[0][1], c = M[0][2];
        double d = M[1][0], e = M[1][1], f = M[1][2];
        double g = M[2][0], h = M[2][1], i = M[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }
    public static double[][] inv2(double[][] M) {
        double det = det2(M);
        if (Math.abs(det) < 1e-9) return new double[][]{};
        return new double[][]{
            { M[1][1]/det, -M[0][1]/det },
            { -M[1][0]/det, M[0][0]/det }
        };
    }
    public static double[][] inv3(double[][] M) {
        double det = det3(M);
        if (Math.abs(det) < 1e-9) return new double[][]{};
        double[][] adj = new double[3][3];
        adj[0][0] =  (M[1][1]*M[2][2] - M[1][2]*M[2][1]);
        adj[0][1] = -(M[1][0]*M[2][2] - M[1][2]*M[2][0]);
        adj[0][2] =  (M[1][0]*M[2][1] - M[1][1]*M[2][0]);
        adj[1][0] = -(M[0][1]*M[2][2] - M[0][2]*M[2][1]);
        adj[1][1] =  (M[0][0]*M[2][2] - M[0][2]*M[2][0]);
        adj[1][2] = -(M[0][0]*M[2][1] - M[0][1]*M[2][0]);
        adj[2][0] =  (M[0][1]*M[1][2] - M[0][2]*M[1][1]);
        adj[2][1] = -(M[0][0]*M[1][2] - M[0][2]*M[1][0]);
        adj[2][2] =  (M[0][0]*M[1][1] - M[0][1]*M[1][0]);
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) inv[i][j] = adj[i][j] / det;
        return inv;
    }
    public static void print(double[][] M) {
        for (double[] row : M) {
            for (double v : row) System.out.printf("%8.3f", v);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] A2 = randomMatrix(2,2);
        double[][] A3 = randomMatrix(3,3);
        System.out.println("A2:"); print(A2);
        System.out.println("Transpose A2:"); print(transpose(A2));
        System.out.println("det(A2): " + det2(A2));
        System.out.println("inv(A2):"); double[][] i2 = inv2(A2); if (i2.length==0) System.out.println("Not invertible"); else print(i2);
        System.out.println("A3:"); print(A3);
        System.out.println("Transpose A3:"); print(transpose(A3));
        System.out.println("det(A3): " + det3(A3));
        System.out.println("inv(A3):"); double[][] i3 = inv3(A3); if (i3.length==0) System.out.println("Not invertible"); else print(i3);
    }
}
