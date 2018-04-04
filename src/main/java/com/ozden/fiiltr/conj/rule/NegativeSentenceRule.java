package com.ozden.fiiltr.conj.rule;

import java.util.HashMap;
import java.util.Map;

public enum NegativeSentenceRule implements Rule {
    NEGATIVE {
        @Override
        public StringBuilder apply(String word) {
            return ImperativeRule.NEGATIVE.apply(word);
        }
    };

    private static final Map<Character, String> NEGATIVE_RULE_WORDS;

    static {
        NEGATIVE_RULE_WORDS = new HashMap<>();
//        NEGATIVE_RULE_WORDS.put('a', "mı");
//        NEGATIVE_RULE_WORDS.put('ı', "mı");
//        NEGATIVE_RULE_WORDS.put('u', "mu");
//        NEGATIVE_RULE_WORDS.put('o', "mu");
//        NEGATIVE_RULE_WORDS.put('e', "mi");
//        NEGATIVE_RULE_WORDS.put('i', "mi");
//        NEGATIVE_RULE_WORDS.put('ü', "mü");
//        NEGATIVE_RULE_WORDS.put('ö', "mü");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
