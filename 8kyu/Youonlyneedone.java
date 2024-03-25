/*https://www.codewars.com/kata/57cc975ed542d3148f00015b
DESCRIPTION:
You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not.
*/

import java.util.Arrays;

public class Youonlyneedone {
    public static void main(String[] args) {
        System.out.println(check(new Object[]{66, 101}, 66)); //true
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45)); //true
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e')); //true
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat")); //false

    }

    public static boolean check(Object[] a, Object x) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x) {
//
//                return true;
//            }
//        }
//
//        return false;


        return Arrays.asList(a).contains(x);
    }

}

