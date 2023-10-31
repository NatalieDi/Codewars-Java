// DESCRIPTION:
//If you can't sleep, just count sheep!!
//
//Task:
//Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

public class IfYouCantSleepJustCountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

     public static String countingSheep(int num) {
    // 1 variant
    // StringBuilder sb = new StringBuilder();
    //   for(int i = 1; i < num+1; i++) {
    //      sb.append(i).append(" sheep...");
    //   }
    //  return sb.toString();
    // }
    // 2 variant
      String a="";
       String b=" sheep...";
        for(int i = 1; i<=num;i++){
          a+=i+b;
        }
      return a;
     }
}
