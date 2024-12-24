/*
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them
(including the first one, excluding the last one).


All inputs will be valid IPv4 addresses in the form of strings.
The last address will always be greater than the first one.

Examples
* With input "10.0.0.0", "10.0.0.50"  => return   50
* With input "10.0.0.0", "10.0.1.0"   => return  256
* With input "20.0.0.10", "20.0.1.0"  => return  246
 */

public class CountIPAddresses {
    public static void main(String[] args) {
        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));//50
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));//246
        System.out.println(ipsBetween("150.0.0.0", "150.0.0.1"));//1
        System.out.println(ipsBetween("0.0.0.0", "255.255.255.255")); //(1l << 32l) - 1l

    }

    public static long ipsBetween(String start, String end) {
        return ipToLong(end) - ipToLong(start);

    }

    private static long ipToLong(String end) {
        String[] ipArray = end.split("\\.");
        long result = 0;
        for (int i = 0; i < ipArray.length; i++) {
            int power = 3 - i;
            result += (Integer.parseInt(ipArray[i]) % 256 * Math.pow(256, power));
        }
        return result;
    }

}

