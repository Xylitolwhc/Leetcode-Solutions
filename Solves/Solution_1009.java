

/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 1009. Complement of Base 10 Integer
 * https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class Solution_1009 {
    public int bitwiseComplement(int N) {
        /*
        //solution 1
        int m = 1;
        while (m <= N) m *= 2;
        return m - N - 1;
        */
        //solution 2
        return (int)Math.pow(2, Integer.toBinaryString(N).length()) - N - 1;
    }
}
