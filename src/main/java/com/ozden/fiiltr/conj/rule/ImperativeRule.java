package com.ozden.fiiltr.conj.rule;

import com.ozden.fiiltr.conj.CommonUtils;

public enum ImperativeRule implements Rule {
    AFFIRMATIVE {
        @Override
        public void apply(StringBuilder word) {
            CommonUtils.removeVerbEnding(word);
        }
    },
    NEGATIVE {
        @Override
        public void apply(StringBuilder word) {
            word.deleteCharAt(word.length() - 1);
        }
    };

    @Override
    public int getOrder() {
        return 1;
    }
}
