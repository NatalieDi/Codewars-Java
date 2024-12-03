

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]{"3:1", "2:2", "0:1"}));//4
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "4:4"}));//13
        System.out.println(points(new String[]{"0:1", "0:1", "0:1"}));//0
        System.out.println(points(new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4"}));//7
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:2", "3:3", "4:4"}));//15
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));//30

    }

    public static int points(String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            int x = Integer.parseInt(game.split(":")[0]);
            int y = Integer.parseInt(game.split(":")[1]);
            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}
