public class Divisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(3, 3, 4));
        System.out.println(isDivisible(12, 3, 4));
        System.out.println(isDivisible(8, 3, 4));
        System.out.println(isDivisible(48, 3, 4));
    }
    public static boolean isDivisible(long m, long x, long y) {
       if (m % x == 0 && m % y == 0) {
           return true;
       } else {
           return false;
       }
    }
}
