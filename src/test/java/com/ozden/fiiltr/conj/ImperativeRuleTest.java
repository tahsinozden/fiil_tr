package com.ozden.fiiltr.conj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImperativeRuleTest {

    @Test
    public void shouldConjugateAffirmativeImperative() {
        String word = "ağlamak";
        assertEquals("ağla", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "görmek";
        assertEquals("gör", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "öpmek";
        assertEquals("öp", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "gelmek";
        assertEquals("gel", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "kalmak";
        assertEquals("kal", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "susmak";
        assertEquals("sus", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "üşümek";
        assertEquals("üşü", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "olmak";
        assertEquals("ol", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "ısırmak";
        assertEquals("ısır", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "incitmek";
        assertEquals("incit", ImperativeRule.AFFIRMATIVE.apply(word).toString());

        word = "artmak";
        assertEquals("art", ImperativeRule.AFFIRMATIVE.apply(word).toString());
    }

    @Test
    public void shouldConjugateNegativeImperative() {
        String word = "ağlamak";
        assertEquals("ağlama", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "görmek";
        assertEquals("görme", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "öpmek";
        assertEquals("öpme", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "gelmek";
        assertEquals("gelme", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "kalmak";
        assertEquals("kalma", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "susmak";
        assertEquals("susma", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "üşümek";
        assertEquals("üşüme", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "olmak";
        assertEquals("olma", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "ısırmak";
        assertEquals("ısırma", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "incitmek";
        assertEquals("incitme", ImperativeRule.NEGATIVE.apply(word).toString());

        word = "artmak";
        assertEquals("artma", ImperativeRule.NEGATIVE.apply(word).toString());
    }
}