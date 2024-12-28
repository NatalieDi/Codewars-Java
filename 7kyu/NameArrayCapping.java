import java.util.Arrays;

public class NameArrayCapping {
    public static void main(String[] args) {
        String[] names = new String[]{"samuel", "MABELLE", "letitia", "meridith"};
        System.out.println(Arrays.toString(capMe(names)));
    }

    public static String[] capMe(String[] strings) {
//        for (int i = 0; i < strings.length; i++) {
//            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
//        }
//        return strings;
//    }

        return Arrays.stream(strings)
                .map(String::toLowerCase)
                .map(s-> Character.toUpperCase(s.charAt(0))+s.substring(1))
                .toArray(String[]::new);
    }
}
