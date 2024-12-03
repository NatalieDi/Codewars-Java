/*
https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 */


import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("abc")));
        System.out.println(Arrays.toString(split("abcdef")));
    }

    public static String[] split(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] result = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            result[i / 2] = s.substring(i, i + 2);
        }
        return result;
    }
}
