
import java.util.*;

public class DeckOfCards {
    static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k = 0;
        for (String r : ranks) for (String s : suits) deck[k++] = r + " of " + s;
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String tmp = deck[i]; deck[i] = deck[randomCardNumber]; deck[randomCardNumber] = tmp;
        }
    }

    static String[][] distribute(String[] deck, int n, int players) {
        if (n > deck.length || n % players != 0) return null;
        int per = n / players;
        String[][] out = new String[players][per];
        int idx = 0;
        for (int p = 0; p < players; p++)
            for (int c = 0; c < per; c++)
                out[p][c] = deck[idx++];
        return out;
    }

    static void printPlayers(String[][] players) {
        if (players == null) {
            System.out.println("Cannot distribute with given n and players (n must be <=52 and divisible by players).");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initDeck();
        shuffle(deck);

        System.out.print("Enter number of cards to deal (<=52): ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        String[][] res = distribute(deck, n, x);
        printPlayers(res);
    }
}

