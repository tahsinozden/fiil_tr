package com.ozden.fiiltr.conj;

public class CommonUtils {

    private CommonUtils() {
        // prevent object creation
    }

    public static StringBuilder removeVerbEnding(String word) {
        return new StringBuilder(word.endsWith("mek") || word.endsWith("mak") ? word.substring(0, word.length() - 3) : word);
    }

    public static String removeCommonVerbEndings(String word) {
        return word.endsWith("mek") || word.endsWith("mak") ? word.substring(0, word.length() - 3) :
                word.endsWith("me") || word.endsWith("ma") ? word.substring(0, word.length() - 2) : word;
    }
}
