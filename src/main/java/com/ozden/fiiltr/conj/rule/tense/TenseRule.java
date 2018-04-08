package com.ozden.fiiltr.conj.rule.tense;

import com.ozden.fiiltr.conj.CommonUtils;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Consumer;

@Component
public class TenseRule {
    public void applyRuleEngine(StringBuilder word, Map<Character, String> wordRules, Consumer<StringBuilder> specialCase) {
        CommonUtils.removeVerbEnding(word);
        if (word.length() < 2) {
            return;
        }

        String ending = wordRules.get(word.charAt(word.length() - 1));
        // in case of last character is a vowel
        if (ending != null) {
            specialCase.accept(word);
            return;
        }

        for (int i = word.length() - 2; i >= 0; --i) {
            ending = wordRules.get(word.charAt(i));
            if (ending != null) break;
        }
        word.append(ending);
    }

    public String determineEndingFromWordRoot(String word, Map<Character, String> wordRules) {
        word = CommonUtils.removeCommonVerbEndings(word);
        if (word.length() < 2) {
            return word;
        }

        String ending = wordRules.get(word.charAt(word.length() - 1));
        // in case of last character is a vowel
        if (ending != null) {
            return ending;
        }

        for (int i = word.length() - 2; i >= 0; --i) {
            ending = wordRules.get(word.charAt(i));
            if (ending != null) break;
        }
        return ending;
    }
}
