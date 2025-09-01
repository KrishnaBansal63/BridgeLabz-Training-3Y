
import java.util.*;

public class MatrixOps {
    public static int[][] randomMatrix(int r, int c) {
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = (int)(Math.random() * 10);
        return a;
    }
    public static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) C[i][j] = A[i][j] + B[i][j];
        return C;
    }
    public static int[][] subtract(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) C[i][j] = A[i][j] - B[i][j];
        return C;
    }
    public static int[][] multiply(int[][] A, int[][] B) {
        int r = A.length, c = B[0].length, n = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                int s = 0;
                for (int k = 0; k < n; k++) s += A[i][k] * B[k][j];
                C[i][j] = s;
            }
        return C;
    }
    public static void print(int[][] M) {
        for (int[] row : M) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = randomMatrix(2, 3);
        int[][] B = randomMatrix(2, 3);
        int[][] C = randomMatrix(3, 2);
        System.out.println("A:"); print(A);
        System.out.println("B:"); print(B);
        System.out.println("A+B:"); print(add(A,B));
        System.out.println("A-B:"); print(subtract(A,B));
        System.out.println("A x C:"); print(multiply(A, C));
    }
}
