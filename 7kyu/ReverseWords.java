//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java/643ab12da35dcd001a2bf9e2

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));//"ehT kciuq nworb xof spmuj revo eht yzal .god"
    }

    public static String reverseWords(String original) {
        StringBuilder result = new StringBuilder();
        String[] words = original.split("(?<=\\s)|(?=\\s)"); // Split by spaces while preserving them

        for (String word : words) {
            if (word.trim().isEmpty()) {
                result.append(word); // Append spaces as they are
            } else {
                result.append(new StringBuilder(word).reverse());
            }
        }

        return result.toString();
    }
}