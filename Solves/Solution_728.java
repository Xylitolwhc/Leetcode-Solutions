import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2017/11/25.
 *
 * @author Hanson
 * 2017/11/25 16:27
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class Solution_728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean b;
        for (Integer i = left; i <= right; i++) {
            b = true;
            for (char j : i.toString().toCharArray()) {
                int n = Integer.parseInt(String.valueOf(j));
                if (n == 0) {
                    b = false;
                    break;
                }
                if (i % n != 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String... args) {
        for (Integer i : selfDividingNumbers(1, 22)) {
            System.out.println(i);
        }
    }
}
