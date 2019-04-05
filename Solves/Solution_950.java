import java.util.Arrays;

/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 950. Reveal Cards In Increasing Order
 * https://leetcode.com/problems/reveal-cards-in-increasing-order/
 */
public class Solution_950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int length = deck.length;

        if (length == 1) {
            return deck;
        }

        Arrays.sort(deck);

        int[] sortedDeck = new int[length];
        if (length == 2) {
            return deck;
        } else {
            sortedDeck[0] = deck[0];
        }
        int flag = 0;
        for (int i = 1; i < length; i++) {
            while (sortedDeck[flag] != 0) {
                flag++;
                flag = flag % length;
            }
            do {
                flag++;
                flag = flag % length;
            } while (sortedDeck[flag] != 0);
            sortedDeck[flag] = deck[i];
        }
        return sortedDeck;
    }
}
