/**
 * Created by Hanson on 2019/4/25
 *
 * @author Hanson
 * 2019/4/25
 * 258. Add Digits
 * https://leetcode.com/problems/add-digits/
 */
public class Solution_258 {
    public int addDigits(int num) {
        return num - 9 * ((num - 9) / 9);
    }
}
