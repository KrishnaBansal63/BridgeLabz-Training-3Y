
public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for (int n : arr) System.out.print(n + " ");
        double[] res = findAverageMinMax(arr);
        System.out.println("\nAverage: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}

