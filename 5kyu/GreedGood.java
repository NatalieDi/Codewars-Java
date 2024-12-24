/*
Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point

 */



public class GreedGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{5, 1, 3, 4, 1}));//250
        System.out.println(greedy(new int[]{1, 1, 1, 3, 1}));//1100
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));//450
    }
    public static int greedy(int[] dice){
//        int[] counts = new int[6];
//        for (int die : dice) {
//            counts[die - 1]++;
//        }
//        int score = 0;
//        for (int i = 0; i < 6; i++) {
//            if (counts[i] >= 3) {
//                score += (i == 0 ? 1000 : (i + 1) * 100);
//                counts[i] -= 3;
//            }
//            if (i == 0) {
//                score += counts[i] * 100;
//            } else if (i == 4) {
//                score += counts[i] * 50;
//            }
//        }
//        return score;
//    }
    int[] counts = new int[6];
        for (int die : dice) {
        counts[die - 1]++;
    }

    int[] scores = {1000, 200, 300, 400, 500, 600};
    int score = 0;

        for (int i = 0; i < 6; i++) {
        score += (counts[i] / 3) * scores[i];
        score += (i == 0 || i == 4) ? (counts[i] % 3) * (i == 0 ? 100 : 50) : 0;
    }

        return score;
}
}

