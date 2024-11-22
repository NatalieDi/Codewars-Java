/*https://www.codewars.com/kata/5d98b6b38b0f6c001a461198/java
Description
Task:
Given strng a string of digits representing a decimal number the function code(strng) should return the coding of strng as explained above.

Given a string strng resulting from the previous coding, decode it to get the corresponding decimal string.

Examples:
code("77338855") --> "001111001111011101110001100000011000001101001101"
code("77338")  --> "0011110011110111011100011000"
code("0011121314") --> "1010111111011011011111001100"

decode("001111001111011101110001100000011000001101001101") -> "77338855"
decode("0011110011110111011100011000") -> "77338"
decode("1010111111011011011111001100") -> "0011121314"
 */
public class Binaries {

    static String f[] = {"1", "1", "01", "01", "001", "001", "001", "001", "0001", "0001"};

    public static void main(String[] args) {
        System.out.println(code("62"));// "0011100110"
        //"55337700"
        System.out.println(decode("001101001101011101110011110011111010")); //55337700
    }
    public static String code(String strng) {
        StringBuilder strbuild = new StringBuilder();
        for (char c : strng.toCharArray())
            strbuild.append(f[c - '0'] + Integer.toBinaryString(c - '0'));
        return strbuild.toString();
    }

    public static String decode(String str) {

        StringBuilder strbuild = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                i++;
                j = 2 * i - j;
                strbuild.append(Integer.parseInt(str.substring(i, j), 2));
                i = j - 1;
            }
        }
        return strbuild.toString();
    }
}


