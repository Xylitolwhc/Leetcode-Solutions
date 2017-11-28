/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 13:30
 * 476. Number Complement
 * https://leetcode.com/problems/number-complement/description/
 */
public class Solution_476 {
    public int findComplement(int num) {
        long s=(long) Math.pow(2,Integer.toBinaryString(num).toString().length())-1;
        return (int)s-num;
    }
}
