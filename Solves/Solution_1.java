import java.util.Hashtable;

/**
 * Created by Hanson on 2019/5/20
 *
 * @author Hanson
 * 2019/5/20
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Hashtable<Integer, Integer> numtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numtable.containsKey(target - num)) {
                result[0] = i;
                result[1] = numtable.get(target - num);
                return result;
            } else {
                numtable.put(num, i);
            }
        }
        return result;
    }
}
