package com.ozden.fiiltr.conj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenseRuleTest {

    @Test
    public void shouldApplyPresentContinuousTense() {
        String word = "ağlamak";
        assertEquals("ağlıyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "görmek";
        assertEquals("görüyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "öpmek";
        assertEquals("öpüyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "gelmek";
        assertEquals("geliyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "kalmak";
        assertEquals("kalıyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "susmak";
        assertEquals("susuyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "üşümek";
        assertEquals("üşüyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "olmak";
        assertEquals("oluyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "ısırmak";
        assertEquals("ısırıyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "incitmek";
        assertEquals("incitiyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());

        word = "artmak";
        assertEquals("artıyor", TenseRule.PRESENT_CONTINUOUS.apply(word).toString());
    }

    @Test
    public void shouldApplyPresentFutureTense() {
        String word = "ağlamak";
        assertEquals("ağlayacak", TenseRule.FUTURE.apply(word).toString());

        word = "görmek";
        assertEquals("görecek", TenseRule.FUTURE.apply(word).toString());

        word = "öpmek";
        assertEquals("öpecek", TenseRule.FUTURE.apply(word).toString());

        word = "gelmek";
        assertEquals("gelecek", TenseRule.FUTURE.apply(word).toString());

        word = "kalmak";
        assertEquals("kalacak", TenseRule.FUTURE.apply(word).toString());

        word = "susmak";
        assertEquals("susacak", TenseRule.FUTURE.apply(word).toString());

        word = "üşümek";
        assertEquals("üşüyecek", TenseRule.FUTURE.apply(word).toString());

        word = "olmak";
        assertEquals("olacak", TenseRule.FUTURE.apply(word).toString());

        word = "ısırmak";
        assertEquals("ısıracak", TenseRule.FUTURE.apply(word).toString());

        word = "incitmek";
        assertEquals("incitecek", TenseRule.FUTURE.apply(word).toString());

        word = "artmak";
        assertEquals("artacak", TenseRule.FUTURE.apply(word).toString());
    }

}