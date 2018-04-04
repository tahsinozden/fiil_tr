package com.ozden.fiiltr.conj;

public class CommonUtils {

    private CommonUtils() {
        // prevent object creation
    }

    public static StringBuilder removeVerbEnding(String word) {
        return new StringBuilder(word.endsWith("mek") || word.endsWith("mak") ? word.substring(0, word.length() - 3) : word);
    }
}
