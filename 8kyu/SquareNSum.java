// DESCRIPTION:
//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because
//1^2+2^2+2^2=1+4+4=9

public class SquareNSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1,2,2,}));
    }
    public static int squareSum(int[] n) {
        int power = 2;
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], power);
        }
        return sum;
    }
}
