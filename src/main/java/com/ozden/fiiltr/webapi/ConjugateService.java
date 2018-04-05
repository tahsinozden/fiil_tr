package com.ozden.fiiltr.webapi;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.RuleCombiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConjugateService {
    @Autowired
    private RuleCombiner ruleCombiner;

    public String applyRules(String word, List<Rule> rules) {
        StringBuilder sb = new StringBuilder(word);
        ruleCombiner.applyMultipleRules(sb, rules);
        return sb.toString();
    }
}
