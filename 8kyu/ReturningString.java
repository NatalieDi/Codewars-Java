public class ReturningString {
    public static void main(String[] args) {
        System.out.println(greet("Oksana"));
        System.out.println(greet("Polina"));
        System.out.println(greet("Yulia"));
    }


    public static String greet(String temp) {
        return "Hello, " + temp + " how are you doing today?";
    }

}
