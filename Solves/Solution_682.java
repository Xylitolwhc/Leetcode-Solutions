import java.util.Stack;

/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 12:31
 * 682. Baseball Game
 * https://leetcode.com/problems/baseball-game/description/
 */
public class Solution_682 {
    public int calPoints(String[] ops) {
        int sum = 0;
        Integer prev, tmp;
        Stack<Integer> scores = new Stack<>();
        for (String type : ops) {
            switch (type) {
                case "+": {
                    prev = scores.pop();
                    tmp = prev + scores.peek();
                    scores.push(prev);
                    scores.push(tmp);
                    break;
                }
                case "D": {
                    scores.push(scores.peek() * 2);
                    break;
                }
                case "C": {
                    scores.pop();
                    break;
                }
                default: {
                    scores.push(Integer.parseInt(type));
                    break;
                }
            }
        }
        while (!scores.empty()) {
            sum += scores.pop();
        }
        return sum;
    }
}
