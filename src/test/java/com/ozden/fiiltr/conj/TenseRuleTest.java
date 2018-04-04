package com.ozden.fiiltr.conj;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenseRuleTest {

    @Test
    public void shouldApplyPresentContinuousTense() {
        String word = "ağlamak";
        assertEquals("ağlıyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "görmek";
        assertEquals("görüyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "öpmek";
        assertEquals("öpüyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "gelmek";
        assertEquals("geliyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "kalmak";
        assertEquals("kalıyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "susmak";
        assertEquals("susuyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "üşümek";
        assertEquals("üşüyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "olmak";
        assertEquals("oluyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "ısırmak";
        assertEquals("ısırıyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "incitmek";
        assertEquals("incitiyor", TenseRule.PRESENT_CONTINUOUS.apply(word));

        word = "artmak";
        assertEquals("artıyor", TenseRule.PRESENT_CONTINUOUS.apply(word));
    }

    @Test
    public void shouldApplyPresentFutureTense() {
        String word = "ağlamak";
        assertEquals("ağlayacak", TenseRule.FUTURE.apply(word));

        word = "görmek";
        assertEquals("görecek", TenseRule.FUTURE.apply(word));

        word = "öpmek";
        assertEquals("öpecek", TenseRule.FUTURE.apply(word));

        word = "gelmek";
        assertEquals("gelecek", TenseRule.FUTURE.apply(word));

        word = "kalmak";
        assertEquals("kalacak", TenseRule.FUTURE.apply(word));

        word = "susmak";
        assertEquals("susacak", TenseRule.FUTURE.apply(word));

        word = "üşümek";
        assertEquals("üşüyecek", TenseRule.FUTURE.apply(word));

        word = "olmak";
        assertEquals("olacak", TenseRule.FUTURE.apply(word));

        word = "ısırmak";
        assertEquals("ısıracak", TenseRule.FUTURE.apply(word));

        word = "incitmek";
        assertEquals("incitecek", TenseRule.FUTURE.apply(word));

        word = "artmak";
        assertEquals("artacak", TenseRule.FUTURE.apply(word));
    }

}