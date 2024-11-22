import java.util.Arrays;

/*https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string

 */
public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));//"01011110001100111"
    }
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}

