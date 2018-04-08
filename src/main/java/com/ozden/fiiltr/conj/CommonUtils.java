package com.ozden.fiiltr.conj;

import java.util.Set;

public class CommonUtils {

    private static final Set<Character> SYLLABLES = Set.of('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü');

    private CommonUtils() {
        // prevent object creation
    }

    public static void removeVerbEnding(StringBuilder word) {
        if (word.length() < 3) {
            return;
        }
        String ending = word.substring(word.length() - 3);
        if ("mek".equals(ending) || "mak".equals(ending)) {
            word.delete(word.length() - 3, word.length());
        }
    }

    public static String removeCommonVerbEndings(String word) {
        if (word.length() < 2) {
            return word;
        }
        return word.endsWith("me") || word.endsWith("ma") ? word.substring(0, word.length() - 2) :
                word.endsWith("mek") || word.endsWith("mak") ? word.substring(0, word.length() - 3) : word;
    }

    public static long countSyllables(String word) {
        return word.chars()
                .mapToObj(i -> (char) i)
                .filter(SYLLABLES::contains).count();
    }
}
