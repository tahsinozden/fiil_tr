package com.ozden.fiiltr.conj.rule;

public enum NegativeSentenceRule implements Rule {
    NEGATIVE {
        @Override
        public StringBuilder apply(String word) {
            return ImperativeRule.NEGATIVE.apply(word);
        }
    };

    @Override
    public int getOrder() {
        return 0;
    }
}
