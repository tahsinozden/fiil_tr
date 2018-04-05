package com.ozden.fiiltr.conj.rule;

public enum NegativeSentenceRule implements Rule {
    NEGATIVE {
        @Override
        public void apply(StringBuilder word) {
            ImperativeRule.NEGATIVE.apply(word);
        }
    };

    @Override
    public int getOrder() {
        return 1;
    }
}
