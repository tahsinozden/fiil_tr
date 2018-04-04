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

        String word = "ağlamak";
        assertEquals("ağlamıyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "görmek";
        assertEquals("görmüyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "öpmek";
        assertEquals("öpmüyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "gelmek";
        assertEquals("gelmiyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "kalmak";
        assertEquals("kalmıyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "susmak";
        assertEquals("susmuyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "üşümek";
        assertEquals("üşümüyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "olmak";
        assertEquals("olmuyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "ısırmak";
        assertEquals("ısırmıyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "incitmek";
        assertEquals("incitmiyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "artmak";
        assertEquals("artmıyor", RuleCombineUtils.applyMultipleRules(word, rules).toString());
    }

    @Test
    public void shouldApplyFutureTenseAndNegativeSentenceRules() {
        rules = Lists.newArrayList(
                TenseRule.FUTURE,
                NegativeSentenceRule.NEGATIVE
        );

        String word = "ağlamak";
        assertEquals("ağlamayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "görmek";
        assertEquals("görmeyecek", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "öpmek";
        assertEquals("öpmeyecek", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "gelmek";
        assertEquals("gelmeyecek", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "kalmak";
        assertEquals("kalmayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "susmak";
        assertEquals("susmayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "üşümek";
        assertEquals("üşümeyecek", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "olmak";
        assertEquals("olmayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "ısırmak";
        assertEquals("ısırmayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "incitmek";
        assertEquals("incitmeyecek", RuleCombineUtils.applyMultipleRules(word, rules).toString());

        word = "artmak";
        assertEquals("artmayacak", RuleCombineUtils.applyMultipleRules(word, rules).toString());
    }
}