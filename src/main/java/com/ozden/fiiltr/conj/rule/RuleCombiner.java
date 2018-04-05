package com.ozden.fiiltr.conj.rule;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Component
public class RuleCombiner {
    public void applyMultipleRules(StringBuilder word, List<Rule> rules) {
        Set<Rule> sortedRules = new TreeSet<>(Comparator.comparingInt(Rule::getOrder));
        sortedRules.addAll(rules);
        sortedRules.forEach(r -> r.apply(word));
    }
}
