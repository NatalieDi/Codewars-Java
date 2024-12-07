/*https://www.codewars.com/kata/554b4ac871d6813a03000035/java
DESCRIPTION:
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
 */

import java.util.Arrays;

public class HighestandLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));// "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));// "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));// "9 -5"
    }
//    public static String highAndLow(String numbers) {
//        String[] numbersArray = numbers.split(" ");
//        String max = numbersArray[0];
//        String min = numbersArray[0];
//
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (Integer.parseInt(max) <= Integer.parseInt(numbersArray[i])) {
//                max = numbersArray[i];
//
//            }
//            if (Integer.parseInt(min) >= Integer.parseInt(numbersArray[i])) {
//                min = numbersArray[i];
//
//
//            }
//        }
//        return (max + " " + min);
//
//    }


    public static String highAndLow(String numbers) {
        int[] mas = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Arrays.stream(mas).max().orElseThrow();
        int min = Arrays.stream(mas).min().orElseThrow();

        return max + " " + min;
    }
}


