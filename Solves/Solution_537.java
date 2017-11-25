import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 16:55
 * 537. Complex Number Multiplication
 * https://leetcode.com/problems/complex-number-multiplication/description/
 */
public class Solution_537 {
    private static String regEx = "([-]?[0-9]+)[+]([-]?[0-9]+)i";

    public String complexNumberMultiply(String a, String b) {
        int[] a0 = solComplex(a), b0 = solComplex(b), sum = new int[2];
        sum[0] = a0[0] * b0[0] - a0[1] * b0[1];
        sum[1] = a0[1] * b0[0] + a0[0] * b0[1];
        return new String(sum[0] + "+" + sum[1] + "i");
    }

    static int[] solComplex(String s) {
        int[] nums = new int[2];
        Pattern r = Pattern.compile(regEx);
        Matcher m = r.matcher(s);
        if (m.find()) {
            nums[0] = Integer.parseInt(m.group(1));
            nums[1] = Integer.parseInt(m.group(2));
        }
        return nums;
    }

    public static void main(String... args) {
        String s="1+-100i";
        Pattern r = Pattern.compile(regEx);
        Matcher m = r.matcher("1+-100i");
        if (m.find()) {
            for (int i = 1; i <= m.groupCount(); i++) {
                System.out.println(m.group(i));
            }
        }
    }
}
