/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 16:39
 * 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/description/
 */
public class Solution_561 {
    int[] array;
    int sum = 0;

    public int arrayPairSum(int[] nums) {
        array = nums;
        quickSort(0, array.length - 1);
        for (int i = 0; i < array.length; i = i + 2) {
            sum += array[i];
        }
        return sum;
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
