
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static int generateGuess(Random rand) {
        return rand.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Think of a number between 1 and 100!");
        String feedback = "";
        int guess;

        do {
            guess = generateGuess(rand);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it High (H), Low (L), or Correct (C)? ");
            feedback = sc.next().toUpperCase();
        } while (!feedback.equals("C"));

        System.out.println("The computer guessed your number correctly!");
    }
}
