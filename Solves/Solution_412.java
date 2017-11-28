import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 13:19
 */
public class Solution_412 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList();
        String s;
        for (int i = 1; i <= n; i++) {
            s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s == "") {
                list.add(i + "");
            } else {
                list.add(s);
            }
        }
        return list;
    }
}
