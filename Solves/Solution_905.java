import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class Solution_905 {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> odd = new ArrayList();
        List<Integer> even = new ArrayList();
        for (int a : A) {
            if(a%2==0){
                even.add(a);
            }else{
                odd.add(a);
            }
        }
        even.addAll(odd);
        for (int i = 0; i < A.length; i++) {
            A[i]=even.get(i);
        }
        return A;
    }
}
