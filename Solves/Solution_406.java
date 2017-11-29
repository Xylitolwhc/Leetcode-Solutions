import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29
 * 406. Queue Reconstruction by Height
 * https://leetcode.com/problems/queue-reconstruction-by-height/description/
 */
public class Solution_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] o1, int[] o2) -> {
            if (o1[0] == o2[0]) return o1[1] >= o2[1] ? 1 : -1;
            return o1[0] >= o2[0] ? -1 : 1;
        });
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            tmp.add(people[i][1], people[i]);
        }
        tmp.toArray(people);
        return people;
    }
}
