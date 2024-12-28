public class IsANumberPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1428851765));//false
        System.out.println(isPrime(1));//false
        System.out.println(isPrime(2));//true
        System.out.println(isPrime(73));//true
        System.out.println(isPrime(75));//false
        System.out.println(isPrime(-1));//false
        System.out.println(isPrime(3));//true
        System.out.println(isPrime(5));//true
        System.out.println(isPrime(7));//true
        System.out.println(isPrime(41));//true
        System.out.println(isPrime(5099));//true
        System.out.println(isPrime(4));//false
        System.out.println(isPrime(6));//false
        System.out.println(isPrime(8));//false
        System.out.println(isPrime(9));//false
        System.out.println(isPrime(45));//false
        System.out.println(isPrime(-5));//false
        System.out.println(isPrime(-8));//false
        System.out.println(isPrime(-41));//false
    }

    public static boolean isPrime(int num) {
//            if (num < 2) {
//                return false;
//            }
//            if (num == 2 || num == 3) {
//                return true;
//            }
//            if (num % 2 == 0 || num % 3 == 0) {
//                return false;
//            }
//
//            for (int i = 5; i * i <= num; i += 6) {
//                if (num % i == 0 || num % (i + 2) == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
