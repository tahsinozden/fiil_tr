package com.ozden.fiiltr.conj.rule;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RuleCombineUtils {
    public static StringBuilder applyMultipleRules(String word, List<Rule> rules) {
        Set<Rule> sortedRules = new TreeSet<>(Comparator.comparingInt(Rule::getOrder));
        sortedRules.addAll(rules);

        StringBuilder result = new StringBuilder(word);
        for (Rule rule : sortedRules) {
            result = rule.apply(result.toString());
        }
        return result;
    }
}
