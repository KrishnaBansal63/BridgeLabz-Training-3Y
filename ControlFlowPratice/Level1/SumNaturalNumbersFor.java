import java.util.Scanner;
class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) sum += i;
            System.out.println("Formula: " + (n * (n + 1) / 2));
            System.out.println("For Loop: " + sum);
        } else System.out.println("Not a natural number");
    }
}
