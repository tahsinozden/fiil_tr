package com.ozden.fiiltr.conj.rule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImperativeRuleTest {

    @Test
    public void shouldConjugateAffirmativeImperative() {
        StringBuilder word = new StringBuilder("ağlamak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("ağla", word.toString());

        word = new StringBuilder("görmek");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("gör", word.toString());

        word = new StringBuilder("öpmek");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("öp", word.toString());

        word = new StringBuilder("gelmek");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("gel", word.toString());

        word = new StringBuilder("kalmak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("kal", word.toString());

        word = new StringBuilder("susmak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("sus", word.toString());

        word = new StringBuilder("üşümek");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("üşü", word.toString());

        word = new StringBuilder("olmak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("ol", word.toString());

        word = new StringBuilder("ısırmak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("ısır", word.toString());

        word = new StringBuilder("incitmek");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("incit", word.toString());

        word = new StringBuilder("artmak");
        ImperativeRule.AFFIRMATIVE.apply(word);
        assertEquals("art", word.toString());
    }

    @Test
    public void shouldConjugateNegativeImperative() {
        StringBuilder word = new StringBuilder("ağlamak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("ağlama", word.toString());

        word = new StringBuilder("görmek");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("görme", word.toString());

        word = new StringBuilder("öpmek");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("öpme", word.toString());

        word = new StringBuilder("gelmek");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("gelme", word.toString());

        word = new StringBuilder("kalmak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("kalma", word.toString());

        word = new StringBuilder("susmak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("susma", word.toString());

        word = new StringBuilder("üşümek");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("üşüme", word.toString());

        word = new StringBuilder("olmak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("olma", word.toString());

        word = new StringBuilder("ısırmak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("ısırma", word.toString());

        word = new StringBuilder("incitmek");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("incitme", word.toString());

        word = new StringBuilder("artmak");
        ImperativeRule.NEGATIVE.apply(word);
        assertEquals("artma", word.toString());
    }
}