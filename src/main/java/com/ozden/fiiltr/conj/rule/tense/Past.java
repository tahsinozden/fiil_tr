package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Consumer;

@Component
public class Past implements Rule {

    private static final Map<Character, String> RULE_WORDS = Map.of(
            'a', "dı",
            'ı', "dı",
            'u', "du",
            'o', "du",
            'e', "di",
            'i', "di",
            'ü', "dü",
            'ö', "dü"
    );

    @Autowired
    private TenseRule tenseRule;

    @Override
    public void apply(StringBuilder word) {
        tenseRule.applyRuleEngine(word, RULE_WORDS, new PastSpecialCase());
    }

    @Override
    public int getOrder() {
        return RuleOrder.TENSE.getOrder();
    }

    class PastSpecialCase implements Consumer<StringBuilder> {
        @Override
        public void accept(StringBuilder s) {
            String ending = tenseRule.determineEndingFromWordRoot(s.toString(), RULE_WORDS);
            s.append(ending);
        }
    }
}
