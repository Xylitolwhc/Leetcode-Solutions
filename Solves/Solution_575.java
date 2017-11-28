import java.util.*;

/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 12:45
 * 575. Distribute Candies
 * https://leetcode.com/problems/distribute-candies/description/
 */
public class Solution_575 {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> kinds = new HashSet<>();
        for (Integer candy : candies) {
            if (!kinds.contains(candy)) {
                kinds.add(candy);
            }
        }
        int size=kinds.size();
        return candies.length > 2 * size ? size : candies.length / 2;
    }
}
