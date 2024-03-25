/*
https://www.codewars.com/kata/56f69d9f9400f508fb000ba7
DESCRIPTION:
You take your son to the forest to see the monkeys. You know that there are a certain number there (n),
but your son is too young to just appreciate the full number, he has to start counting them from 1.
As a good parent, you will sit and count with him. Given the number (n),
populate an array with all numbers up to and including that number, but excluding zero.
For example(Input --> Output):
10 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 1 --> [1]
*/

import java.util.Arrays;

public class CounttheMonkey {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(10)));
        System.out.println(Arrays.toString(monkeyCount(1)));
    }

    public static int[] monkeyCount(final int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}

