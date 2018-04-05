package com.ozden.fiiltr.conj.rule;

public interface Rule {
    void apply(StringBuilder word);

    default int getOrder() {
        return 0;
    }
}
