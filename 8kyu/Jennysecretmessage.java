/*
*/

public class Jennysecretmessage {
    public static void main(String[] args) {
        System.out.println(greet("Jim"));
        System.out.println(greet("Jane"));
        System.out.println(greet("Simon"));
        System.out.println(greet("Johnny"));//"Hello, my love!"
    }
        public static String greet(String name) {
            if(name.equals("Johnny")){
                return "Hello, my love!";
            }
            else {
                return String.format("Hello, %s!", name);
            }
        }
    }


