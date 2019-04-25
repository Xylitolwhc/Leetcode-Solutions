/**
 * Created by Hanson on 2019/4/25
 *
 * @author Hanson
 * 2019/4/25
 * 748. Shortest Completing Word
 * https://leetcode.com/problems/shortest-completing-word/
 */
public class Solution_748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] license = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                license[Character.toLowerCase(c) - 'a'] += 1;
            }
        }
        String shortest = "";
        int min = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() > min)
                continue;
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    count[Character.toLowerCase(c) - 'a'] += 1;
                }
            }
            boolean isCompleting = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] < license[i]) {
                    isCompleting = false;
                    break;
                }
            }
            if (isCompleting){
                shortest = word;
                min = word.length();
            }
        }
        return shortest;
    }
}
