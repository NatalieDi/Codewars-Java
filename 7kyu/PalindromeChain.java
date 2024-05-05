public class PalindromeChain {
    public static void main(String[] args) {
        System.out.println("chain length = " + palindromeChainLength(87));
    }

    public static int palindromeChainLength(long n) {
        long sum;
        int i = 0;
        while (true) {
            sum = isPalindrome(n);
            if (sum == n)
                break;
            n += sum;
            i += 1;
        }
        return i;
    }
    public static long isPalindrome ( long x){
        long n1 = 0;
        while (x != 0) {
            n1 = n1 * 10 + x % 10;
            x = x / 10;
        }
        return n1;
    }

}





