import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/train/java
 */
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinct(new int[]{1, 2, 1, 2, 1, 2, 3})));//{1,2,3}
        System.out.println(Arrays.toString(distinct(new int[]{1, 1, 2})));//{1,2}
    }

    public static int[] distinct(int[] array) {
//        List<Integer> list = new ArrayList<>();
//        for (int i : array) {
//            list.add(i);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (Objects.equals(list.get(i), list.get(j))) {
//                    list.remove(j);
//                    j--;
//                }
//            }
//        }
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//        return result;
//    }
//
//}

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}