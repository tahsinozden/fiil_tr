package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Consumer;

@Component
public class PresentContinuous implements Rule {

    private static final Map<Character, String> RULE_WORDS = Map.of(
            'a', "ıyor",
            'ı', "ıyor",
            'u', "uyor",
            'o', "uyor",
            'e', "iyor",
            'i', "iyor",
            'ü', "üyor",
            'ö', "üyor"
    );
    
    @Autowired
    private TenseRule tenseRule;

    @Override
    public void apply(StringBuilder word) {
        tenseRule.applyRuleEngine(word, RULE_WORDS, new PresentContinuousSpecialCase());
    }

    @Override
    public int getOrder() {
        return RuleOrder.TENSE.getOrder();
    }

    class PresentContinuousSpecialCase implements Consumer<StringBuilder> {
        @Override
        public void accept(StringBuilder s) {
//                String ending = RULE_WORDS.get(s.charAt(s.length() - 1));
            String ending = tenseRule.determineEndingFromWordRoot(s.toString(), RULE_WORDS);
            s.deleteCharAt(s.length() - 1).append(ending);
        }
    }
}
