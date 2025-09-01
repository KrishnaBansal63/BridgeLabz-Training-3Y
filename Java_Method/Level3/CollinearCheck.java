
import java.util.*;

public class CollinearCheck {
    public static boolean collinearSlope(double x1,double y1,double x2,double y2,double x3,double y3) {
        double abx = x2 - x1, aby = y2 - y1;
        double bcx = x3 - x2, bcy = y3 - y2;
        return Math.abs(abx * bcy - aby * bcx) < 1e-9;
    }
    public static boolean collinearArea(double x1,double y1,double x2,double y2,double x3,double y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return Math.abs(area) < 1e-9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();
        System.out.println("Collinear (Slope): " + collinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear (Area): " + collinearArea(x1,y1,x2,y2,x3,y3));
    }
}
