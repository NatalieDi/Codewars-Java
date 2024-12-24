import java.util.Arrays;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));// [ 2, 9, 3, 49, 4, 1 ]
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{100, 101, 5, 5, 1, 1})));//[10, 10201, 25, 25, 1, 1]
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{1, 2, 3, 4, 5, 6})));//[1, 4, 9, 2, 25, 36]

    }

    public static int[] squareOrSquareRoot(int[] array) {
//        int[] newarray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            if (Math.sqrt(array[i]) % 1 == 0) {
//                newarray[i] = (int) Math.sqrt(array[i]);
//            } else {
//                newarray[i] = array[i] * array[i];
//            }
//        }
//        return newarray;
//    }


        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }
}

