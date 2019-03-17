import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 804. Unique Morse Code Words
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class Solution_804 {
    private static final String[] MORSE_CODES = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        List<String> morse = new ArrayList<>();
        String tmp;
        for (String word : words) {
            tmp = "";
            for (char letter : word.toCharArray()) {
                tmp += MORSE_CODES[(int) letter - 97];
            }
            if (!morse.contains(tmp)) {
                morse.add(tmp);
            }
        }
        return morse.size();
    }


    public static void main(String... args) {
        System.out.println((int) 'a');
    }
}
