package com.ozden.fiiltr.conj.rule;

import com.ozden.fiiltr.conj.rule.sentence.NegativeSentence;
import com.ozden.fiiltr.conj.rule.tense.Future;
import com.ozden.fiiltr.conj.rule.tense.PresentContinuous;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RuleCombinerTest {

    @Autowired
    private RuleCombiner ruleCombiner;

    @Autowired
    private PresentContinuous presentContinuous;

    @Autowired
    private NegativeSentence negativeSentence;

    @Autowired
    private Future future;

    private List<Rule> rules;

    @Test
    public void shouldApplyPresentContinuousAndNegativeSentenceRules() {
        rules = Lists.newArrayList(
                presentContinuous,
                negativeSentence
        );

        StringBuilder word = new StringBuilder("ağlamak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("ağlamıyor", word.toString());

        word = new StringBuilder("görmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("görmüyor", word.toString());

        word = new StringBuilder("öpmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("öpmüyor", word.toString());

        word = new StringBuilder("gelmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("gelmiyor", word.toString());

        word = new StringBuilder("kalmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("kalmıyor", word.toString());

        word = new StringBuilder("susmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("susmuyor", word.toString());

        word = new StringBuilder("üşümek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("üşümüyor", word.toString());

        word = new StringBuilder("olmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("olmuyor", word.toString());

        word = new StringBuilder("ısırmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("ısırmıyor", word.toString());

        word = new StringBuilder("incitmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("incitmiyor", word.toString());

        word = new StringBuilder("artmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("artmıyor", word.toString());
    }

    @Test
    public void shouldApplyFutureTenseAndNegativeSentenceRules() {
        rules = Lists.newArrayList(
                future,
                negativeSentence
        );

        StringBuilder word = new StringBuilder("ağlamak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("ağlamayacak", word.toString());

        word = new StringBuilder("görmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("görmeyecek", word.toString());

        word = new StringBuilder("öpmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("öpmeyecek", word.toString());

        word = new StringBuilder("gelmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("gelmeyecek", word.toString());

        word = new StringBuilder("kalmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("kalmayacak", word.toString());

        word = new StringBuilder("susmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("susmayacak", word.toString());

        word = new StringBuilder("üşümek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("üşümeyecek", word.toString());

        word = new StringBuilder("olmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("olmayacak", word.toString());

        word = new StringBuilder("ısırmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("ısırmayacak", word.toString());

        word = new StringBuilder("incitmek");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("incitmeyecek", word.toString());

        word = new StringBuilder("artmak");
        ruleCombiner.applyMultipleRules(word, rules);
        assertEquals("artmayacak", word.toString());
    }
}