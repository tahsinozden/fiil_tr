package com.ozden.fiiltr.conj.rule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NegativeSentenceRuleTest {
    @Test
    public void shouldNegateVerb() {
        String word = "ağlamak";
        assertEquals("ağlama", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "görmek";
        assertEquals("görme", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "öpmek";
        assertEquals("öpme", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "gelmek";
        assertEquals("gelme", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "kalmak";
        assertEquals("kalma", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "susmak";
        assertEquals("susma", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "üşümek";
        assertEquals("üşüme", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "olmak";
        assertEquals("olma", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "ısırmak";
        assertEquals("ısırma", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "incitmek";
        assertEquals("incitme", NegativeSentenceRule.NEGATIVE.apply(word).toString());

        word = "artmak";
        assertEquals("artma", NegativeSentenceRule.NEGATIVE.apply(word).toString());
    }
}