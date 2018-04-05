package com.ozden.fiiltr.conj.rule;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RuleCombineUtilsTest {

    private List<Rule> rules;

    @Test
    public void shouldApplyPresentContinuousAndNegativeSentenceRules() {
        rules = Lists.newArrayList(
                TenseRule.PRESENT_CONTINUOUS,
                NegativeSentenceRule.NEGATIVE
        );

        StringBuilder word = new StringBuilder("ağlamak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("ağlamıyor", word.toString());

        word = new StringBuilder("görmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("görmüyor", word.toString());

        word = new StringBuilder("öpmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("öpmüyor", word.toString());

        word = new StringBuilder("gelmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("gelmiyor", word.toString());

        word = new StringBuilder("kalmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("kalmıyor", word.toString());

        word = new StringBuilder("susmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("susmuyor", word.toString());

        word = new StringBuilder("üşümek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("üşümüyor", word.toString());

        word = new StringBuilder("olmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("olmuyor", word.toString());

        word = new StringBuilder("ısırmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("ısırmıyor", word.toString());

        word = new StringBuilder("incitmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("incitmiyor", word.toString());

        word = new StringBuilder("artmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("artmıyor", word.toString());
    }

    @Test
    public void shouldApplyFutureTenseAndNegativeSentenceRules() {
        rules = Lists.newArrayList(
                TenseRule.FUTURE,
                NegativeSentenceRule.NEGATIVE
        );

        StringBuilder word = new StringBuilder("ağlamak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("ağlamayacak", word.toString());

        word = new StringBuilder("görmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("görmeyecek", word.toString());

        word = new StringBuilder("öpmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("öpmeyecek", word.toString());

        word = new StringBuilder("gelmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("gelmeyecek", word.toString());

        word = new StringBuilder("kalmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("kalmayacak", word.toString());

        word = new StringBuilder("susmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("susmayacak", word.toString());

        word = new StringBuilder("üşümek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("üşümeyecek", word.toString());

        word = new StringBuilder("olmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("olmayacak", word.toString());

        word = new StringBuilder("ısırmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("ısırmayacak", word.toString());

        word = new StringBuilder("incitmek");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("incitmeyecek", word.toString());

        word = new StringBuilder("artmak");
        RuleCombineUtils.applyMultipleRules(word, rules);
        assertEquals("artmayacak", word.toString());
    }
}