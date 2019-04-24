import java.util.*;

/**
 * Created by Hanson on 2019/4/24
 *
 * @author Hanson
 * 2019/4/24
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> inter = new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                inter.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] result = new int[inter.size()];
        int k = 0;
        for (Integer num : inter) {
            result[k++] = num;
        }
        return result;
    }
}
