package com.ozden.fiiltr.conj.rule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NegativeSentenceRuleTest {
    @Test
    public void shouldNegateVerb() {
        StringBuilder word = new StringBuilder("ağlamak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("ağlama", word.toString());

        word = new StringBuilder("görmek");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("görme", word.toString());

        word = new StringBuilder("öpmek");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("öpme", word.toString());

        word = new StringBuilder("gelmek");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("gelme", word.toString());

        word = new StringBuilder("kalmak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("kalma", word.toString());

        word = new StringBuilder("susmak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("susma", word.toString());

        word = new StringBuilder("üşümek");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("üşüme", word.toString());

        word = new StringBuilder("olmak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("olma", word.toString());

        word = new StringBuilder("ısırmak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("ısırma", word.toString());

        word = new StringBuilder("incitmek");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("incitme", word.toString());

        word = new StringBuilder("artmak");
        NegativeSentenceRule.NEGATIVE.apply(word);
        assertEquals("artma", word.toString());
    }
}