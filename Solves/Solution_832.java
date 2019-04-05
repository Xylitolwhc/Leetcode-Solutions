/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 832. Flipping an Image
 * https://leetcode.com/problems/flipping-an-image/
 */
public class Solution_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length + 1) / 2; j++) {
                int tmp = 1 - A[i][length - j - 1];
                A[i][length - j - 1] = 1 - A[i][j];
                A[i][j] = tmp;
            }
        }
        return A;
    }
}
