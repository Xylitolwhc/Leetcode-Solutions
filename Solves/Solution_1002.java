import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 1002. Find Common Characters
 * https://leetcode.com/problems/find-common-characters/
 */
public class Solution_1002 {
    List<String> characters = new ArrayList<>();

    public List<String> commonChars(String[] A) {
        for (char a : A[0].toCharArray()) {
            characters.add(Character.toString(a));
        }

        for (int i = 1; i < A.length; i++) {

            for (int k = 0; k < characters.size(); k++) {
                String character = characters.get(k);

                if (A[i].contains(character)) {
                    A[i] = A[i].replaceFirst(character, "");
                    continue;
                }

                characters.remove(k);
                k--;

            }
        }
        return characters;
    }

    public static void main(String... a) {
        String[] test = {"bella", "label", "roller"};

        for (String s : new Solution_1002().commonChars(test))
            System.out.print(s+"\t");
    }
}
