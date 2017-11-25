/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 17:45
 * 419. Battleships in a Board
 * https://leetcode.com/problems/battleships-in-a-board/description/
 */
public class Solution_419 {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    if (i == 0 && j == 0) {
                        count++;
                        continue;
                    }
                    if (i == 0 && board[i][j - 1] == '.') {
                        count++;
                        continue;
                    }
                    if (j == 0 && board[i - 1][j] == '.') {
                        count++;
                        continue;
                    }
                    if (i != 0 && j != 0) {
                        if (board[i][j - 1] == '.' && board[i - 1][j] == '.') {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String... args) {
    }
}
