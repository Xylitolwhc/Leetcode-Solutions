/**
 * Created by hanson on 2019/4/15
 *
 * @author Hanson
 * 2019/4/15
 * 868. Binary Gap
 * https://leetcode.com/problems/binary-gap/
 */
public class Solution_868 {
    public int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        int index = binary.indexOf("1"),
                maxGap = 0;
        do {
            binary = binary.substring(index + 1);
            index = binary.indexOf("1");
            if (index + 1 > maxGap) {
                maxGap = index + 1;
            }
        } while (index != -1);
        return maxGap;
    }
}
