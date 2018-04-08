package com.ozden.fiiltr.webapi;

import com.ozden.fiiltr.conj.rule.Rule;
import com.ozden.fiiltr.conj.rule.imperative.AffirmativeImperative;
import com.ozden.fiiltr.conj.rule.imperative.NegativeImperative;
import com.ozden.fiiltr.conj.rule.sentence.NegativeSentence;
import com.ozden.fiiltr.conj.rule.tense.Future;
import com.ozden.fiiltr.conj.rule.tense.PresentContinuous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/conj")
public class ConjugateController {

    @Autowired
    private ConjugateService conjugateService;

    @Autowired
    private ApplicationContext context;

    private Map<String, Rule> RULE_MAP;

    @PostConstruct
    public void init() {
        RULE_MAP = Map.of(
                "presnt_cont", (PresentContinuous) context.getBean("presentContinuous"),
                "future", (Future) context.getBean("future"),
                "affrm_imp", (AffirmativeImperative) context.getBean("affirmativeImperative"),
                "neg_imp", (NegativeImperative) context.getBean("negativeImperative"),
                "neg", (NegativeSentence) context.getBean("negativeSentence")
        );
    }

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

        Rule tenseRule = RULE_MAP.getOrDefault(tense, (PresentContinuous) context.getBean("presentContinuous"));
        Rule negativeRule = RULE_MAP.get(sentence);
        var rules = Stream.of(tenseRule, negativeRule)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        return conjugateService.applyRules(word, rules);
    }
}
