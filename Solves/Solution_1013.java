import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Hanson on 2019/4/23
 *
 * @author Hanson
 * 2019/4/23
 * 1013. Partition Array Into Three Parts With Equal Sum
 * https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 */
public class Solution_1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0, avg, count = 0;
        for (int a : A) {
            sum += a;
        }
        if (sum % 3 != 0) return false;

        avg = sum / 3;
        sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == avg) {
                count++;
                sum = 0;
                if (count == 3) return true;
            }
        }

        return false;
    }
}
