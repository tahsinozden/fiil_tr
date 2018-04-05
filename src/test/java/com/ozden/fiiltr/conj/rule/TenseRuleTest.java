package com.ozden.fiiltr.conj.rule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenseRuleTest {

    @Test
    public void shouldApplyPresentContinuousTense() {
        StringBuilder word = new StringBuilder("ağlamak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("ağlıyor", word.toString());

        word = new StringBuilder("görmek");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("görüyor", word.toString());

        word = new StringBuilder("öpmek");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("öpüyor", word.toString());

        word = new StringBuilder("gelmek");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("geliyor", word.toString());

        word = new StringBuilder("kalmak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("kalıyor", word.toString());

        word = new StringBuilder("susmak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("susuyor", word.toString());

        word = new StringBuilder("üşümek");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("üşüyor", word.toString());

        word = new StringBuilder("olmak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("oluyor", word.toString());

        word = new StringBuilder("ısırmak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("ısırıyor", word.toString());

        word = new StringBuilder("incitmek");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("incitiyor", word.toString());

        word = new StringBuilder("artmak");
        TenseRule.PRESENT_CONTINUOUS.apply(word);
        assertEquals("artıyor", word.toString());
    }

    @Test
    public void shouldApplyPresentFutureTense() {
        StringBuilder word = new StringBuilder("ağlamak");
        TenseRule.FUTURE.apply(word);
        assertEquals("ağlayacak", word.toString());

        word = new StringBuilder("görmek");
        TenseRule.FUTURE.apply(word);
        assertEquals("görecek", word.toString());

        word = new StringBuilder("öpmek");
        TenseRule.FUTURE.apply(word);
        assertEquals("öpecek", word.toString());

        word = new StringBuilder("gelmek");
        TenseRule.FUTURE.apply(word);
        assertEquals("gelecek", word.toString());

        word = new StringBuilder("kalmak");
        TenseRule.FUTURE.apply(word);
        assertEquals("kalacak", word.toString());

        word = new StringBuilder("susmak");
        TenseRule.FUTURE.apply(word);
        assertEquals("susacak", word.toString());

        word = new StringBuilder("üşümek");
        TenseRule.FUTURE.apply(word);
        assertEquals("üşüyecek", word.toString());

        word = new StringBuilder("olmak");
        TenseRule.FUTURE.apply(word);
        assertEquals("olacak", word.toString());

        word = new StringBuilder("ısırmak");
        TenseRule.FUTURE.apply(word);
        assertEquals("ısıracak", word.toString());

        word = new StringBuilder("incitmek");
        TenseRule.FUTURE.apply(word);
        assertEquals("incitecek", word.toString());

        word = new StringBuilder("artmak");
        TenseRule.FUTURE.apply(word);
        assertEquals("artacak", word.toString());
    }

}