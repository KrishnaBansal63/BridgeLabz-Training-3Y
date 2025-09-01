
import java.util.Scanner;
public class SplitWordsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        if(words.length >= 2) {
            if(words[0].equals(words[1])) {
                System.out.println("First two words are equal.");
            } else {
                System.out.println("First two words are not equal.");
            }
        } else {
            System.out.println("Not enough words to compare.");
        }
    }
}
