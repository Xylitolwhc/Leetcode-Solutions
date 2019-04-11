import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/11
 *
 * @author Hanson
 * 2019/4/11
 * 944. Delete Columns to Make Sorted
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class Solution_944 {
    public int minDeletionSize(String[] A) {
        if (A.length <= 1) return 0;

        List<Integer> columns = new ArrayList<>();
        for (int i = 0; i < A.length - 1; i++) {
            char[] str1 = A[i].toCharArray(),
                    str2 = A[i + 1].toCharArray();
            for (int j = 0; j < A[i].length(); j++) {
                if (str1[j] > str2[j]) {
                    if (!columns.contains(j))
                        columns.add(j);
                }
            }
        }
        return columns.size();
    }
}
