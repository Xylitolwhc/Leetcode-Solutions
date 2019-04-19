import java.util.Hashtable;

/**
 * Created by Hanson on 2019/4/18
 *
 * @author Hanson
 * 2019/4/18
 * 953. Verifying an Alien Dictionary
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
public class Solution_953 {
    public boolean isAlienSorted(String[] words, String order) {
        Hashtable<Character, Integer> alphabet = new Hashtable<>();
        for (int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (compare(words[i], words[i + 1], alphabet) > 0) {
                return false;
            }
        }
        return true;
    }

    private int compare(String word1, String word2, Hashtable<Character, Integer> alphabet) {
        int length1 = word1.length(),
                length2 = word2.length();
        int minLength = Math.min(length1, length2);
        char[] letters1 = word1.toCharArray(),
                letters2 = word2.toCharArray();

        for (int i = 0; i < minLength; i++) {
            if (alphabet.get(letters1[i]) != alphabet.get(letters2[i]))
                return alphabet.get(letters1[i]) - alphabet.get(letters2[i]);
        }
        return length1 - length2;
    }
}
