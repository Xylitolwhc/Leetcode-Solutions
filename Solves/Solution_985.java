/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 985. Sum of Even Numbers After Queries
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */
public class Solution_985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] sumEven = new int[A.length];
        int sum = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        for (int i = 0; i < queries.length; i++) {

            int val = queries[i][0],
                    index = queries[i][1];

            if (A[index] % 2 == 0) {
                if (val % 2 == 0) {
                    sum += val;
                } else {
                    sum -= A[index];
                }
            } else if (val % 2 != 0) {
                sum += A[index] + val;
            }
            A[index] += val;
            sumEven[i] = sum;

        }
        return sumEven;
    }
}
