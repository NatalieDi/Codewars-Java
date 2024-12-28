public class SimpleBeadsCount {
    public static void main(String[] args) {
        System.out.println(countRedBeads(0));//0
        System.out.println(countRedBeads(1));//0
        System.out.println(countRedBeads(3));//4
        System.out.println(countRedBeads(5));//8
        System.out.println(countRedBeads(10));//18
    }

    public static int countRedBeads(final int nBlue) {
//        if (nBlue < 2) {
//            return 0;
//        }
//        return (nBlue - 1) * 2;

        return nBlue < 2 ? 0 : 2*nBlue - 2;
    }
}
