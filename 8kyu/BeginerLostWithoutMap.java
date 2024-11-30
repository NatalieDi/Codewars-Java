import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BeginerLostWithoutMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3, 4, 5})));//[2, 4, 6, 8, 10]
    }

    public static int[] map(int[] arr) {
        Map<Integer, Integer> mapArray = new HashMap<>();
        int[] resultArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapArray.put(i, arr[i] * 2);
            resultArray[i] = mapArray.get(i);
        }

        return resultArray;
    }

}
