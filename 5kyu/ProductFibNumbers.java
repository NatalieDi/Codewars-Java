import java.util.Arrays;
import java.util.stream.Stream;

public class ProductFibNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));//new long[]{55, 89, 1}
        System.out.println(Arrays.toString(productFib(5895)));//new long[]{89, 144, 0}
        System.out.println(Arrays.toString(productFib(74049690)));//new long[]{6765, 10946, 1}
        System.out.println(Arrays.toString(productFib(84049690)));//new long[]{10946, 17711, 0}
        System.out.println(Arrays.toString(productFib(193864606)));//new long[]{10946, 17711, 1}
        System.out.println(Arrays.toString(productFib(447577)));//new long[]{610, 987, 0}
        System.out.println(Arrays.toString(productFib(602070)));//new long[]{610, 987, 1}
    }

    public static long[] productFib(long prod) {
//        long f0 = 0;
//        long f1 = 1;
//        while (f0 * f1 < prod) {
//            long temp = f0;
//            f0 = f1;
//            f1 = temp + f1;
//        }
//        return new long[]{f0, f1, f0 * f1 == prod ? 1 : 0};

        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .filter(f -> f[0] * f[1] >= prod)
                .findFirst()
                .map(f -> new long[]{f[0], f[1], f[0] * f[1] == prod ? 1 : 0})
                .get();
    }
}

