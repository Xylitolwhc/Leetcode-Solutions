/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 */
public class Solution_509 {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int n0 = 0, n1 = 1;
        for (int i = 0; i < N - 1; i++) {
            int tmp = n0 + n1;
            n0 = n1;
            n1 = tmp;
        }
        return n1;
    }
}
