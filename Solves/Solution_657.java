/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 16:08
 * 657. Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class Solution_657 {
    public boolean judgeCircle(String moves) {
        Long LR = new Long(0), UD = new Long(0);
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    LR--;
                    break;
                case 'R':
                    LR++;
                    break;
                case 'U':
                    UD++;
                    break;
                case 'D':
                    UD--;
                    break;
            }
        }
        return LR == 0 && UD == 0;
    }
}
