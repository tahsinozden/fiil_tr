package com.ozden.fiiltr.webapi;

import com.ozden.fiiltr.conj.rule.ImperativeRule;
import com.ozden.fiiltr.conj.rule.NegativeSentenceRule;
import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.TenseRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/conj")
public class ConjugateController {

    private static final Map<String, Rule> RULE_MAP = Map.of(
            "presnt_cont", TenseRule.PRESENT_CONTINUOUS,
            "future", TenseRule.FUTURE,
            "affrm_imp", ImperativeRule.AFFIRMATIVE,
            "neg_imp", ImperativeRule.NEGATIVE,
            "neg", NegativeSentenceRule.NEGATIVE
    );

    @Autowired
    private ConjugateService conjugateService;

    @RequestMapping("/{word}")
    public String applyRules(@PathVariable String word, @RequestParam(defaultValue = "presnt_cont") String tense,
                             @RequestParam(defaultValue = "pos") String sentence,
                             @RequestParam(required = false) String imperative) {

        if (imperative != null) {
            Rule rule = RULE_MAP.get(imperative);
            if (rule == null) {
                throw new IllegalArgumentException(imperative + " is not a valid option!");
            }
            return conjugateService.applyRules(word, List.of(rule));
        }

        Rule tenseRule = RULE_MAP.getOrDefault(tense, TenseRule.PRESENT_CONTINUOUS);
        Rule negativeRule = RULE_MAP.get(sentence);
        var rules = Stream.of(tenseRule, negativeRule)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        return conjugateService.applyRules(word, rules);
    }
}
