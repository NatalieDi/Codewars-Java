import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class AlphabeticAnagrams {
    public static void main(String[] args) {
        System.out.println(new AlphabeticAnagrams().listPosition("A"));           // Output: 1
        System.out.println(new AlphabeticAnagrams().listPosition("ABAB"));       // Output: 2
        System.out.println(new AlphabeticAnagrams().listPosition("AAAB"));       // Output: 1
        System.out.println(new AlphabeticAnagrams().listPosition("BAAA"));       // Output: 4
        System.out.println(new AlphabeticAnagrams().listPosition("QUESTION"));   // Output: 24572
        System.out.println(new AlphabeticAnagrams().listPosition("BOOKKEEPER")); // Output: 10743
    }

    public BigInteger listPosition(String word) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        BigInteger rank = BigInteger.ONE; // Start rank at 1
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char current = word.charAt(i);

            for (char c = 'A'; c < current; c++) {
                if (charCount.containsKey(c) && charCount.get(c) > 0) {
                    charCount.put(c, charCount.get(c) - 1);
                    rank = rank.add(calculatePermutations(charCount, length - i - 1));
                    charCount.put(c, charCount.get(c) + 1);
                }
            }

            // Decrement the count of the current character
            charCount.put(current, charCount.get(current) - 1);
            if (charCount.get(current) == 0) {
                charCount.remove(current);
            }
        }

        return rank;
    }

    private BigInteger calculatePermutations(Map<Character, Integer> charCount, int remainingLength) {
        BigInteger numerator = factorial(remainingLength);
        BigInteger denominator = BigInteger.ONE;

        for (int count : charCount.values()) {
            denominator = denominator.multiply(factorial(count));
        }

        return numerator.divide(denominator);
    }

    private BigInteger factorial(int n) {
        if (n <= 1) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
