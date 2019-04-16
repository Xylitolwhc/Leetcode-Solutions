/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 762. Prime Number of Set Bits in Binary Representation
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class Solution_762 {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            int setBits = 0, num = i;
            while (num > 0) {
                setBits += num % 2;
                num /= 2;
            }
            if (isPrime(setBits)){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
