import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by hanson on 2019/4/11
 *
 * @author Hanson
 * 2019/4/11
 * 933. Number of Recent Calls
 * https://leetcode.com/problems/number-of-recent-calls/
 */
public class Solution_933 {

    class RecentCounter {
        Deque<Integer> pings = new ArrayDeque<>();


        public RecentCounter() {

        }

        public int ping(int t) {
            pings.offer(t);
            while (pings.size() != 0 && t - pings.peek() > 3000) {
                pings.poll();
            }
            return pings.size();
        }
    }
}

