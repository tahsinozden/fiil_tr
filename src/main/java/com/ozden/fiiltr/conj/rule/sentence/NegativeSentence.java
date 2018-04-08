package com.ozden.fiiltr.conj.rule.sentence;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleOrder;
import com.ozden.fiiltr.conj.rule.imperative.NegativeImperative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NegativeSentence implements Rule {

    @Autowired
    private NegativeImperative negativeImperative;

    @Override
    public void apply(StringBuilder word) {
        negativeImperative.apply(word);
    }

    @Override
    public int getOrder() {
        return RuleOrder.SENTENCE.getOrder();
    }
}
