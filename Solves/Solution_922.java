import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 922. Sort Array By Parity II
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class Solution_922 {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> odd = new ArrayList<>(),
                even = new ArrayList<>();
        for (int a : A) {
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        for (int i = 0; i < A.length / 2; i++) {
            A[i * 2] = even.get(i);
            A[i * 2 + 1] = odd.get(i);
        }
        return A;
    }
}
