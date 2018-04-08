package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@Component
public class Future implements Rule {

    private static final Map<Character, String> FUTURE_WORDS;

    static {
        FUTURE_WORDS = new HashMap<>();
        FUTURE_WORDS.put('a', "acak");
        FUTURE_WORDS.put('ı', "acak");
        FUTURE_WORDS.put('u', "acak");
        FUTURE_WORDS.put('o', "acak");
        FUTURE_WORDS.put('e', "ecek");
        FUTURE_WORDS.put('i', "ecek");
        FUTURE_WORDS.put('ü', "ecek");
        FUTURE_WORDS.put('ö', "ecek");
    }

    @Autowired
    private TenseRule tenseRule;

    @Override
    public void apply(StringBuilder word) {
        tenseRule.applyRuleEngine(word, FUTURE_WORDS, new FutureSpecialCase());
    }

    @Override
    public int getOrder() {
        return 2;
    }

    class FutureSpecialCase implements Consumer<StringBuilder> {
        @Override
        public void accept(StringBuilder s) {
//                String ending = FUTURE_WORDS.get(s.charAt(s.length() - 1));
            String ending = tenseRule.determineEndingFromWordRoot(s.toString(), FUTURE_WORDS);
            s.append("y").append(ending);
        }
    }
}
