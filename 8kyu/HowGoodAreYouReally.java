// DESCRIPTION:
//There was a test in your class and you passed it. Congratulations!
//But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//Return True if you're better, else False!
//
//Note:
//Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!
public class HowGoodAreYouReally {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int s = 0;
        for (int i = 0; i < classPoints.length; i++) {
            s = s + classPoints[i];
        }
        int arg = s / classPoints.length;
        return arg <= yourPoints;
    }
}
