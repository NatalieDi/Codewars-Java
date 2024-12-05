public class LuckyN {
    public static void main(String[] args) {
        System.out.println(isLucky(1892376));//true ["1892376"] => ["1","8","9","2","3","7","6"] =1+8+9+2+3+7+6 = 36
        System.out.println(isLucky(189237));//false
        System.out.println(isLucky(189238));//false
        System.out.println(isLucky(189239));//false
        System.out.println(isLucky(189230));//false
        System.out.println(isLucky(9));//
    }

    public static boolean isLucky(long n) {
        String[] arr = String.valueOf(n).split("");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
        if (sum % 9 == 0 )  {
            return true;
        }
        return false;
    }
}
