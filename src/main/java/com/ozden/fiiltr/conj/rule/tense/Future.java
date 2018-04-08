package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Consumer;

@Component
public class Future implements Rule {

    private static final Map<Character, String> RULE_WORDS = Map.of(
            'a', "acak",
            'ı', "acak",
            'u', "acak",
            'o', "acak",
            'e', "ecek",
            'i', "ecek",
            'ü', "ecek",
            'ö', "ecek"
    );

    @Autowired
    private TenseRule tenseRule;

    @Override
    public void apply(StringBuilder word) {
        tenseRule.applyRuleEngine(word, RULE_WORDS, new FutureSpecialCase());
    }

    @Override
    public int getOrder() {
        return RuleOrder.TENSE.getOrder();
    }

    class FutureSpecialCase implements Consumer<StringBuilder> {
        @Override
        public void accept(StringBuilder s) {
//                String ending = RULE_WORDS.get(s.charAt(s.length() - 1));
            String ending = tenseRule.determineEndingFromWordRoot(s.toString(), RULE_WORDS);
            s.append("y").append(ending);
        }
    }
}
