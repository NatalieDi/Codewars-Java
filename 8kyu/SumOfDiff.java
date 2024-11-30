import java.util.Arrays;

public class SumOfDiff {
    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));//9
        System.out.println(sumOfDifferences(new int[]{-3, -2, -1}));//2
        System.out.println(sumOfDifferences(new int[]{17, 17, 12, 2, 13, 20, 11, 1, 9, 12, 11, 14, 2, 7, 5, 11, 19, 3, 5, 6, 7, 4}));//19
    }

    public static int sumOfDifferences(int[] arr) {
        int result = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            Arrays.sort(arr);
            result = result + (arr[i] - arr[i - 1]);

        }
        return result;
    }
}

