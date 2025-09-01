import java.util.Scanner;
class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, i = 1;
        if (n >= 0) {
            while (i <= n) sum += i++;
            System.out.println("Formula: " + (n * (n + 1) / 2));
            System.out.println("While Loop: " + sum);
        } else System.out.println("Not a natural number");
    }
}
