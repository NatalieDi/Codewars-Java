/*
https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
Description
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

Example(Input1, Input2 --> Output)
[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindNumbersWhichDivisibleGivenNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},2)));//[2, 4, 6]
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},3)));//[3, 6]
        System.out.println(Arrays.toString(divisibleBy(new int[] {0,1,2,3,4,5,6},4)));//[0, 4]
    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                result.add(numbers[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

