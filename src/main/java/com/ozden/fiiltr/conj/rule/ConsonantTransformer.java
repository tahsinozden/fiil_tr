package com.ozden.fiiltr.conj.rule;

import java.util.Map;
import java.util.Set;

/**
 * All the letters in the alphabet are either consonants or vowels. A consonant is a speech sound in which the air is
 * at least partly blocked, and any letter which represents this.[1] Consonants may come singly (by themselves) or
 * in clusters (two or more together), but must be connected to a vowel to form a syllable.
 */
public class ConsonantTransformer {

    private static final Set<Character> CAUSING_TRANSFORMATION = Set.of('f', 's', 't', 'k', 'ç', 'ş', 'h', 'p');

    private static final Map<Character, Character> TRANSFORMATION_BY_CONSONANT = Map.of(
            'p', 'b',
            'ç', 'c',
            't', 'd',
            'k', 'g',
            'b', 'p',
            'c', 'ç',
            'd', 't',
            'g', 'k'
    );

    public static void transform(StringBuilder word) {
        for (int i = 1; i < word.length(); i++) {
            Character toBeTransformed = TRANSFORMATION_BY_CONSONANT.get(word.charAt(i));
            if (CAUSING_TRANSFORMATION.contains(word.charAt(i - 1)) && toBeTransformed != null) {
                word.setCharAt(i, toBeTransformed);
            }
        }
    }
}
