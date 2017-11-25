/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 18:49
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/description/
 */
public class Solution_338 {

    public static int[] countBits(int num) {
        int[] nums = new int[num + 1];
        nums[0] = 0;
        int k = 1;
        while (k <= num) {
            for (int i = 0; i < k; i++) {
                nums[k + i] = nums[i] + 1;
                if (k + i == num) return nums;
            }
            k *= 2;
        }
        return nums;
    }

    public static void main(String... args) {
        for (int i : countBits(5)) {
            System.out.println(i);
        }
    }
}
