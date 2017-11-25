/**
 * Created by hanson on 2017/11/25.
 *
 * @author Hanson
 * 2017/11/25 15:58
 * 500. Keyboard Row
 * https://leetcode.com/problems/keyboard-row/description/
 */
public class Solution_500 {
    static String[] up = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
    static String[] middle = new String[]{"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    static String[] down = new String[]{"z", "x", "c", "v", "b", "n", "m"};

    public static String[] findWords(String[] words) {
        String result = "";
        int i = 0;
        for (String word : words) {
            i = 0;
            for (String s : up) {
                if (word.toLowerCase().contains(s)) {
                    i++;
                    break;
                }
            }
            for (String s : middle) {
                if (word.toLowerCase().contains(s)) {
                    i++;
                    break;
                }
            }
            if (i >= 2) continue;
            for (String s : down) {
                if (word.toLowerCase().contains(s)) {
                    i++;
                    break;
                }
            }
            if (i >= 2) continue;
            result += word + " ";
        }
        if (result.equals("")) return new String[0];
        return result.split(" ");
    }

    public static void main(String... args) {
        String[] s = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        for (String s0 : findWords(s))
            System.out.println(s0);
    }
}
