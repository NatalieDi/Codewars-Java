public class Automorphics {
    public static void main(String[] args) {
        System.out.println(autoMorphic(25));//Automorphic
        System.out.println(autoMorphic(13));//Not!!
        System.out.println(autoMorphic(76));//Automorphic
        System.out.println(autoMorphic(225));//Automorphic
    }
    public static String autoMorphic(int number) {
        return (number * number + "").endsWith(number + "") ? "Automorphic" : "Not!!";

    }
}

