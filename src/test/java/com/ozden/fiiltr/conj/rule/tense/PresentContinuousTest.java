package com.ozden.fiiltr.conj.rule.tense;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PresentContinuousTest {

    @Autowired
    private PresentContinuous presentContinuous;

    @Test
    public void shouldApplyPresentContinuousTense() {
        StringBuilder word = new StringBuilder("ağlamak");
        presentContinuous.apply(word);
        assertEquals("ağlıyor", word.toString());

        word = new StringBuilder("görmek");
        presentContinuous.apply(word);
        assertEquals("görüyor", word.toString());

        word = new StringBuilder("öpmek");
        presentContinuous.apply(word);
        assertEquals("öpüyor", word.toString());

        word = new StringBuilder("gelmek");
        presentContinuous.apply(word);
        assertEquals("geliyor", word.toString());

        word = new StringBuilder("kalmak");
        presentContinuous.apply(word);
        assertEquals("kalıyor", word.toString());

        word = new StringBuilder("susmak");
        presentContinuous.apply(word);
        assertEquals("susuyor", word.toString());

        word = new StringBuilder("üşümek");
        presentContinuous.apply(word);
        assertEquals("üşüyor", word.toString());

        word = new StringBuilder("olmak");
        presentContinuous.apply(word);
        assertEquals("oluyor", word.toString());

        word = new StringBuilder("ısırmak");
        presentContinuous.apply(word);
        assertEquals("ısırıyor", word.toString());

        word = new StringBuilder("incitmek");
        presentContinuous.apply(word);
        assertEquals("incitiyor", word.toString());

        word = new StringBuilder("artmak");
        presentContinuous.apply(word);
        assertEquals("artıyor", word.toString());
    }
}