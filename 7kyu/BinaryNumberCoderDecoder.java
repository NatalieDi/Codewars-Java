public class BinaryNumberCoderDecoder {
    public static void main(String[] args) {
        System.out.println(code("75"));
        System.out.println(decode("1001011"));
        System.out.println(code("62"));// "0011100110"
        System.out.println(code("55337700")); // "001101001101011101110011110011111010"
        System.out.println(code("1119441933000055"));// "1111110001100100110000110011000110010111011110101010001101001101");
        System.out.println(code("69")); //"00111000011001"
        System.out.println(code("86"));// "00011000001110"

    }

    public static String code(String strng) {
        int i = Integer.parseInt(strng);
        return Integer.toBinaryString(i);
    }

    public static String decode(String str) {

        String s = Integer.parseInt(str, 2) + "";
        return s;
    }
}
