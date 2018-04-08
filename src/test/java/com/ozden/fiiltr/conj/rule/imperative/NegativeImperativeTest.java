package com.ozden.fiiltr.conj.rule.imperative;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NegativeImperativeTest {

    @Autowired
    private NegativeImperative negativeImperative;

    @Test
    public void shouldConjugateNegativeImperative() {
        StringBuilder word = new StringBuilder("ağlamak");
        negativeImperative.apply(word);
        assertEquals("ağlama", word.toString());

        word = new StringBuilder("görmek");
        negativeImperative.apply(word);
        assertEquals("görme", word.toString());

        word = new StringBuilder("öpmek");
        negativeImperative.apply(word);
        assertEquals("öpme", word.toString());

        word = new StringBuilder("gelmek");
        negativeImperative.apply(word);
        assertEquals("gelme", word.toString());

        word = new StringBuilder("kalmak");
        negativeImperative.apply(word);
        assertEquals("kalma", word.toString());

        word = new StringBuilder("susmak");
        negativeImperative.apply(word);
        assertEquals("susma", word.toString());

        word = new StringBuilder("üşümek");
        negativeImperative.apply(word);
        assertEquals("üşüme", word.toString());

        word = new StringBuilder("olmak");
        negativeImperative.apply(word);
        assertEquals("olma", word.toString());

        word = new StringBuilder("ısırmak");
        negativeImperative.apply(word);
        assertEquals("ısırma", word.toString());

        word = new StringBuilder("incitmek");
        negativeImperative.apply(word);
        assertEquals("incitme", word.toString());

        word = new StringBuilder("artmak");
        negativeImperative.apply(word);
        assertEquals("artma", word.toString());
    }
}