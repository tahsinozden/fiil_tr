package com.ozden.fiiltr.conj.rule.imperative;

import com.ozden.fiiltr.conj.CommonUtils;
import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleOrder;
import org.springframework.stereotype.Component;

@Component
public class AffirmativeImperative implements Rule {

    @Override
    public void apply(StringBuilder word) {
        CommonUtils.removeVerbEnding(word);
    }

    @Override
    public int getOrder() {
        return RuleOrder.IMPERATIVE.getOrder();
    }
}
