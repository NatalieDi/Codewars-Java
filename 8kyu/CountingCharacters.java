public class CountingCharacters {
    public static void main(String[] args) {
        System.out.println(countCharOccurrences("fizzbuzz", 'z'));//4
        System.out.println(countCharOccurrences("FIZZBUZZ", 'z'));//4
        System.out.println(countCharOccurrences("missippi", 'i'));//3
        System.out.println(countCharOccurrences("missippi", 's'));//2
    }

    public static int countCharOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(c)) {
                count++;
            }
        }
        return count;

    }
}
