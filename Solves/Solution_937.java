import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hanson on 2019/4/15
 *
 * @author Hanson
 * 2019/4/15
 * 937. Reorder Log Files
 * https://leetcode.com/problems/reorder-log-files/
 */
public class Solution_937 {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String[]> letterLogs = new ArrayList<>(),
                digitLogs = new ArrayList<>();
        for (String log : logs) {
            String[] words = log.split(" ", 2);
            if (Character.isDigit(words[1].charAt(0))) {
                digitLogs.add(words);
            } else {
                letterLogs.add(words);
            }
        }
        Collections.sort(letterLogs, (a, b) -> {
            int diff = a[1].compareTo(b[1]);
            if (diff != 0) return diff;
            else return a[0].compareTo(b[0]);
        });

        int index = 0;
        for (String[] words : letterLogs) {
            logs[index] = words[0] + " " + words[1];
            index++;
        }
        for (String[] words : digitLogs) {
            logs[index] = words[0] + " " + words[1];
            index++;
        }
        return logs;
    }
}
