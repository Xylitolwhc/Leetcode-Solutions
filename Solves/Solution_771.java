/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 771. Jewels and Stones
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class Solution_771 {

    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (char c : S.toCharArray()) {
            if (J.contains(c + "")) {
                num++;
            }
        }
        return num;
    }

    public static void main(String... args) {
        System.out.println(new Solution_771().numJewelsInStones("aA", "aAAbbbb"));
    }
}
