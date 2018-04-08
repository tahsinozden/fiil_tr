package com.ozden.fiiltr.conj.rule.imperative;

import com.ozden.fiiltr.conj.rule.Rule;
import org.springframework.stereotype.Component;

@Component
public class NegativeImperative implements Rule {
    @Override
    public void apply(StringBuilder word) {
        word.deleteCharAt(word.length() - 1);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
