
import java.util.*;

public class Marks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   // n students, 3 subjects

        for(int i=0;i<n;i++){
            System.out.println("Student " + (i+1));
            for(int j=0;j<3;j++) marks[i][j] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<3;j++) sum+=marks[i][j];
            double per=sum/3.0;
            String g = per>=90?"A":per>=75?"B":per>=50?"C":"D";
            System.out.println("Student "+(i+1)+" %:"+per+" Grade:"+g);
        }
    }
}

