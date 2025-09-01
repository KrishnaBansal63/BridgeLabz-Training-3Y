
import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int y) {
        return y >= 1582 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}

