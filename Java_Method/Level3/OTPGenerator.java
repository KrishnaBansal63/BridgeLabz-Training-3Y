
import java.util.*;

public class OTPGenerator {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean allUnique(int[] a) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int x : a) set.add(x);
        return set.size() == a.length;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("OTPs: " + java.util.Arrays.toString(otps));
        System.out.println("All unique? " + allUnique(otps));
    }
}
