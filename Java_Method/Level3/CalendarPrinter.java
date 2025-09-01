
import java.util.*;

public class CalendarPrinter {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    public static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    public static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2) return isLeap(y) ? 29 : 28;
        return days[m-1];
    }
    public static int firstDayOfMonth(int m, int y) {
        // Zeller's congruence (0=Saturday,...,6=Friday). Convert to 0=Sunday..6=Saturday
        int q = 1;
        if (m < 3) { m += 12; y -= 1; }
        int K = y % 100;
        int J = y / 100;
        int h = (q + (13*(m+1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
        int d = (h + 6) % 7; // 0=Sunday
        return d;
    }
    public static void printCalendar(int m, int y) {
        System.out.println("    " + months[m-1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = firstDayOfMonth(m, y);
        int days = daysInMonth(m, y);
        for (int i = 0; i < first; i++) System.out.print("    ");
        int dow = first;
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            dow++;
            if (dow == 7) { System.out.println(); dow = 0; }
        }
        if (dow != 0) System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        printCalendar(m, y);
    }
}
