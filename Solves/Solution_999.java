/**
 * Created by hanson on 2019/4/11
 *
 * @author Hanson
 * 2019/4/11
 * 999. Available Captures for Rook
 * https://leetcode.com/problems/available-captures-for-rook/
 */
public class Solution_999 {
    public int numRookCaptures(char[][] board) {
        int sum = 0, x = 0, y = 0, length = board.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        //left
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] != '.') {
                if (board[i][y] == 'p') sum++;
                break;
            }
        }
        //right
        for (int i = x + 1; i < length; i++) {
            if (board[i][y] != '.') {
                if (board[i][y] == 'p') sum++;
                break;
            }
        }
        //up
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] != '.') {
                if (board[x][i] == 'p') sum++;
                break;
            }
        }
        //down
        for (int i = y + 1; i < length; i++) {
            if (board[x][i] != '.') {
                if (board[x][i] == 'p') sum++;
                break;
            }
        }
        return sum;
    }
}
