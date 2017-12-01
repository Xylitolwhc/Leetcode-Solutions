/**
 * Created by hanson on 2017/11/30.
 *
 * @author Hanson
 * 2017/11/30
 * 553. Optimal Division
 * https://leetcode.com/problems/optimal-division/description/
 */
public class Solution_553 {
    public String optimalDivision(int[] nums) {
        StringBuilder div = new StringBuilder("");
        div.append(nums[0]);
        switch (nums.length) {
            case 1:
                break;
            case 2:
                div.append("/" + nums[1]);
                break;
            default:
                div.append("/(" + nums[1]);
                for (int i = 2; i < nums.length; i++) {
                    div.append("/" + nums[i]);
                }
                div.append(")");
        }
        return div.toString();
    }
}
