// DESCRIPTION:
//We need a function that can transform a number (integer) into a string.
//What ways of achieving this do you know?
//
//Examples (input --> output):
//123  --> "123"
//999  --> "999"
//-100 --> "-100"

public class ConvertNumberToString {
    public static void main(String[] args) {
        System.out.println(numberToString(-100));
    }
    public static String numberToString(int num) {
        return String.valueOf(num) ;
    }
}
