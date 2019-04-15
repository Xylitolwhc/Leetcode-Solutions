import java.util.*;

/**
 * Created by hanson on 2019/4/15
 *
 * @author Hanson
 * 2019/4/15
 * 884. Uncommon Words from Two Sentences
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class Solution_884 {
    public String[] uncommonFromSentences(String A, String B) {
        Hashtable<String, Integer> words = new Hashtable<>();
        for (String s : (A + " " + B).split(" ")) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }

        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
}
