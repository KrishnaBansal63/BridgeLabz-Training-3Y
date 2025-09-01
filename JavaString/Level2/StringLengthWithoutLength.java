
import java.util.Scanner;
public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = 0;
        for(char c : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of string (without length()): " + length);
    }
}
