import java.util.Scanner;
public class CountCharsWordsLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (end input with an empty line):");
        StringBuilder sb = new StringBuilder();
        String line;
        int lines = 0;
        while(!(line = sc.nextLine()).isEmpty()) {
            sb.append(line).append("\n");
            lines++;
        }
        String text = sb.toString();
        int chars = text.replace("\n", "").length();
        int words = text.trim().isEmpty() ? 0 : text.trim().split("\s+").length;
        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
