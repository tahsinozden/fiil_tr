package com.ozden.fiiltr.conj.rule;

public enum RuleOrder {
    IMPERATIVE(1),
    SENTENCE(1),
    TENSE(2);

    private int order;

    RuleOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
}
