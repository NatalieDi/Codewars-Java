/*https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/java
Description
A format for expressing an ordered list of integers is to use a comma separated list of either

individual integers
or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. The range includes all integers in the interval including both endpoints. It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.

Example:

Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 */

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        System.out.println(rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        Buffer buffer = new Buffer();
        for (int n : arr) {
            if (!buffer.add(n)) {
                sb.append(buffer).append(',');
                buffer = new Buffer();
                buffer.add(n);
            }
        }
        // Добавляем оставшийся буфер
        sb.append(buffer);
        return sb.toString();
    }
}

class Buffer {

    private final List<Integer> integers = new ArrayList<>();

    boolean add(int n) {
        if (accepts(n)) {
            return integers.add(n);
        }
        return false;
    }

    private boolean accepts(int n) {
        return integers.isEmpty() || last() == n - 1;
    }

    private Integer first() {
        return integers.get(0);
    }

    private Integer last() {
        return integers.get(integers.size() - 1);
    }

    @Override
    public String toString() {
        if (integers.size() == 1) {
            return last().toString();
        }
        if (integers.size() == 2) {
            return String.format("%d,%d", first(), last());
        }
        if (integers.size() > 2) {
            return String.format("%d-%d", first(), last());
        }
        return "";
    }
}

