package com.ozden.fiiltr.conj.rule;

import com.ozden.fiiltr.conj.CommonUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public enum TenseRule implements Rule {

    PRESENT_CONTINUOUS {
        @Override
        public StringBuilder apply(String word) {
            return applyRuleEngine(word, PRESENT_CONT_WORDS, new PresentContinuousSpecialCase());
        }

        class PresentContinuousSpecialCase implements Function<StringBuilder, StringBuilder> {
            @Override
            public StringBuilder apply(StringBuilder s) {
//                String ending = PRESENT_CONT_WORDS.get(s.charAt(s.length() - 1));
                String ending = findEndingWordRoot(s.toString(), PRESENT_CONT_WORDS);
                s.deleteCharAt(s.length() - 1);
                return s.append(ending);
            }
        }
    },
    FUTURE {
        @Override
        public StringBuilder apply(String word) {
            return applyRuleEngine(word, FUTURE_WORDS, new FutureSpecialCase());
        }

        class FutureSpecialCase implements Function<StringBuilder, StringBuilder> {
            @Override
            public StringBuilder apply(StringBuilder s) {
//                String ending = FUTURE_WORDS.get(s.charAt(s.length() - 1));
                String ending = findEndingWordRoot(s.toString(), FUTURE_WORDS);
                s.append("y");
                return s.append(ending);
            }
        }
    };

    private static final Map<Character, String> PRESENT_CONT_WORDS;
    private static final Map<Character, String> FUTURE_WORDS;

    static {
        PRESENT_CONT_WORDS = new HashMap<>();
        PRESENT_CONT_WORDS.put('a', "ıyor");
        PRESENT_CONT_WORDS.put('ı', "ıyor");
        PRESENT_CONT_WORDS.put('u', "uyor");
        PRESENT_CONT_WORDS.put('o', "uyor");
        PRESENT_CONT_WORDS.put('e', "iyor");
        PRESENT_CONT_WORDS.put('i', "iyor");
        PRESENT_CONT_WORDS.put('ü', "üyor");
        PRESENT_CONT_WORDS.put('ö', "üyor");

        FUTURE_WORDS = new HashMap<>();
        FUTURE_WORDS.put('a', "acak");
        FUTURE_WORDS.put('ı', "acak");
        FUTURE_WORDS.put('u', "acak");
        FUTURE_WORDS.put('o', "acak");
        FUTURE_WORDS.put('e', "ecek");
        FUTURE_WORDS.put('i', "ecek");
        FUTURE_WORDS.put('ü', "ecek");
        FUTURE_WORDS.put('ö', "ecek");
    }

    private static StringBuilder applyRuleEngine(String word, Map<Character, String> wordRules, Function<StringBuilder, StringBuilder> specialCase) {
        StringBuilder root = CommonUtils.removeVerbEnding(word);
        if (root.length() < 2) {
            return new StringBuilder(word);
        }

        String ending = wordRules.get(root.charAt(root.length() - 1));
        // in case of last character is a vowel
        if (ending != null) {
            return specialCase.apply(root);
        }

        for (int i = root.length() - 2; i >= 0; --i) {
            ending = wordRules.get(root.charAt(i));
            if (ending != null) break;
        }
        return root.append(ending);
    }

    private static String findEndingWordRoot(String word, Map<Character, String> wordRules) {
        word = CommonUtils.removeCommonVerbEndings(word);
        if (word.length() < 2) {
            return word;
        }

        String ending = wordRules.get(word.charAt(word.length() - 1));
        // in case of last character is a vowel
        if (ending != null) {
            return ending;
        }

        for (int i = word.length() - 2; i >= 0; --i) {
            ending = wordRules.get(word.charAt(i));
            if (ending != null) break;
        }
        return ending;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
