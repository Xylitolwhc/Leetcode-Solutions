import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hanson on 2019/4/2
 *
 * @author Hanson
 * 2019/4/2
 * 961. N-Repeated Element in Size 2N Array
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class Solution_961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int n : A) {
            if (nums.contains(n)) {
                return n;
            } else {
                nums.add(n);
            }
        }
        return 0;
    }
}
