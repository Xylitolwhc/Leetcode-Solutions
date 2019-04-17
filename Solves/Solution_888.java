import java.util.Arrays;

/**
 * Created by Hanson on 2019/4/17
 *
 * @author Hanson
 * 2019/4/17
 * 888. Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/
 */
public class Solution_888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] swap = new int[2];
        Arrays.sort(A);
        Arrays.sort(B);

        int diff = 0;
        for (int a : A) {
            diff += a;
        }
        for (int b : B) {
            diff -= b;
        }
        diff /= 2;
        int a = 0, b = 0;
        while (a < A.length && b < B.length) {
            if (A[a] - B[b] > diff) {
                b++;
            } else if (A[a] - B[b] < diff) {
                a++;
            } else {
                swap[0] = A[a];
                swap[1] = B[b];
                break;
            }
        }
        return swap;
    }
}
