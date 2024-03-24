/*https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
//Description
//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
        Examples (input -> output)
        6, "I"     -> "IIIIII"
        5, "Hello" -> "HelloHelloHelloHelloHello"

 */
public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello "));
        System.out.println(repeatStr(5, ""));
        System.out.println(repeatStr(0, "Hi"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
