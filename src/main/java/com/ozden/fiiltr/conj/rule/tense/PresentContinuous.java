package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@Component
public class PresentContinuous implements Rule {

    private static final Map<Character, String> PRESENT_CONT_WORDS;

    static {
        PRESENT_CONT_WORDS = new HashMap<>();
        PRESENT_CONT_WORDS.put('a', "ıyor");
        PRESENT_CONT_WORDS.put('ı', "ıyor");
        PRESENT_CONT_WORDS.put('u', "uyor");
        PRESENT_CONT_WORDS.put('o', "uyor");
        PRESENT_CONT_WORDS.put('e', "iyor");
        PRESENT_CONT_WORDS.put('i', "iyor");
        PRESENT_CONT_WORDS.put('ü', "üyor");
        PRESENT_CONT_WORDS.put('ö', "üyor");
    }

    @Autowired
    private TenseRule tenseRule;

    @Override
    public void apply(StringBuilder word) {
        tenseRule.applyRuleEngine(word, PRESENT_CONT_WORDS, new PresentContinuousSpecialCase());
    }

    @Override
    public int getOrder() {
        return 2;
    }

    class PresentContinuousSpecialCase implements Consumer<StringBuilder> {
        @Override
        public void accept(StringBuilder s) {
//                String ending = PRESENT_CONT_WORDS.get(s.charAt(s.length() - 1));
            String ending = tenseRule.determineEndingFromWordRoot(s.toString(), PRESENT_CONT_WORDS);
            s.deleteCharAt(s.length() - 1).append(ending);
        }
    }
}
