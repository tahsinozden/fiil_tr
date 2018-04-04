package com.ozden.fiiltr.conj;

public enum ImperativeRule implements Rule {
    AFFIRMATIVE {
        @Override
        public StringBuilder apply(String word) {
            return CommonUtils.removeVerbEnding(word);
        }
    },
    NEGATIVE {
        @Override
        public StringBuilder apply(String word) {
            return new StringBuilder(word.substring(0, word.length() - 1));
        }
    };

    @Override
    public int getOrder() {
        return 0;
    }
}
