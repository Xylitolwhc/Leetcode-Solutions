/**
 * Created by hanson on 2017/12/3.
 *
 * @author Hanson
 * 2017/12/3
 * 526. Beautiful Arrangement
 * https://leetcode.com/problems/beautiful-arrangement/description/
 */
public class Solution_526 {
    public static int countArrangement(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        return count + 1;
    }


    public static void main(String... a) {
        System.out.print(countArrangement(2));
    }
}
