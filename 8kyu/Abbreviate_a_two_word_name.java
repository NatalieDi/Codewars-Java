// DESCRIPTION:
// Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
// The output should be two capital letters with a dot separating them.
// It should look like this:
// Sam Harris => S.H
// patrick feeney => P.F
//STRINGS FUNDAMENTALS

import java.util.Arrays;
import java.util.stream.Collectors;

public class Abbreviate_a_two_word_name {
    public static void main(String[] args) {
        System.out.println(abbrevName("Natalie Diekmann"));
    }
//    public static String abbrevName(String name) {
//        name = name.toUpperCase();
//        String[] names = name.split(" ");
//        return names[0].charAt(0)+"."+names[1].charAt(0);
//      }


    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase())
                .collect(Collectors.joining("."));

    }

}
