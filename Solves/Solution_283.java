import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Hanson on 2019/4/24
 *
 * @author Hanson
 * 2019/4/24
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 */
public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (index == -1) {
                    index = i;
                }
            } else if (index != -1) {
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
        }
    }
}
