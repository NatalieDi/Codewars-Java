/*https://www.codewars.com/kata/615da209cf564e0032b3ecc6/train/java*/

public class RegexMatchingAllPositive {
    public static void main(String[] args) {
        System.out.println(regexBelow(1337));
    }

    public static String regexBelow(long n) {
        n = n - 1; // Adjust to match numbers strictly less than n
        String nStr = String.valueOf(n); // Convert to string for digit handling
        int len = nStr.length(); // Length of n
        StringBuilder res = new StringBuilder();

        // Handle numbers with fewer digits
        if (len > 1) {
            res.append("^[1-9]\\d{0,").append(len - 2).append("}$|");
        }

        // Handle numbers with the same length as n
        res.append("^");
        for (int i = 0; i < len; i++) {
            char digit = nStr.charAt(i);
            if (i == 0) {
                // Leading digit must be between 1 and the first digit of n
                res.append("[1-").append(digit).append("]");
            } else {
                // Subsequent digits must be between 0 and the current digit
                res.append("[0-").append(digit).append("]");
            }
            // If this is the last digit, end the regex
            if (i == len - 1) {
                res.append("$");
            } else {
                // Allow fewer digits for smaller numbers
                res.append("|");
            }
        }

        return res.toString();
    }
}
