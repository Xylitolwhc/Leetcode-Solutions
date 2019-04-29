import java.util.Hashtable;

/**
 * Created by Hanson on 2019/4/29
 *
 * @author Hanson
 * 2019/4/29
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 */
public class Solution_169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Hashtable<Integer, Integer> count = new Hashtable<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                int n = count.get(num) + 1;
                if (n >= (nums.length + 1) / 2)
                    return num;
                count.put(num, n);
            } else {
                count.put(num, 1);
            }
        }
        return -1;
    }
}
