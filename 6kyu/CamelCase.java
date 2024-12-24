public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase(""));
        System.out.println(camelCase(" camel case word"));//"CamelCaseWord"
        System.out.println(camelCase("camelcase word"));//"CamelCaseWord"
        System.out.println(camelCase("test  case"));//"TestCase"
        System.out.println(camelCase("say hello "));//"SayHello"
    }

    public static String camelCase(String str) {
        if (str.isEmpty()) {
            return "";
        }
        // Corrected: Assign the result back to `str`
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        String[] arr = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (!s.isEmpty()) { // Avoid adding empty strings due to extra spaces
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
            }
        }
        return sb.toString();
    }
}
