/*https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
Description
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int sequence(int[] arr) {
        int max = 0;
        int sum;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i];
            if (sum > max) max = sum;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) max = sum;

            }
        }

        return max;
    }
}
