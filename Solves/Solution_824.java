import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 824. Goat Latin
 * https://leetcode.com/problems/goat-latin/
 */
public class Solution_824 {
    public String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (vowel.contains(words[i].charAt(0))) {
                words[i] += "ma";
            } else {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ma";
            }
            for (int j = 0; j < i + 1; j++) {
                words[i] += "a";
            }
        }
        String latin = "";
        for (String word : words) {
            latin += word + " ";
        }
        return latin.trim();
    }
}
