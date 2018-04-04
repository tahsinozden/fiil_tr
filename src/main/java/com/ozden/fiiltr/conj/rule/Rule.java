package com.ozden.fiiltr.conj.rule;

public interface Rule {
    StringBuilder apply(String word);

    default int getOrder() {
        return 0;
    }
}
